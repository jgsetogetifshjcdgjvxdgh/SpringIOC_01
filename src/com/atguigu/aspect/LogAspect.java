package com.atguigu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public int com.atguigu.service.Calculator.*(int, int))")
    public void myJoint(){

    }

    @Before("myJoint()")
    public static void start(JoinPoint joinPoint){
        System.out.println( joinPoint.getSignature().getName() + "方法执行前, 参数为");
    }

    @AfterReturning( value = "execution(public int com.atguigu.service.Calculator.*(int, int))",returning = "result")
    public static void after(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName() +"方法执行后, 结果为" + result);
    }

    @AfterThrowing(value = "execution(public int com.atguigu.service.Calculator.*(int, int))",throwing = "e")
    public static void getException(JoinPoint joinPoint,Exception e){
        System.out.println(joinPoint.getSignature().getName() +"方法执行异常, 原因为"+ e );
    }

    @Around("myJoint()")
    public static void aroud(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        String name = pjp.getSignature().getName();
        System.out.println( name + "环绕通知方法执行前, 参数为");
        try {
            Object result = pjp.proceed(args);
            System.out.println(name +"环绕通知方法执行后, 结果为" + result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println(name +"环绕通知方法执行异常, 原因为"+ throwable.getCause());
//            throw  new Exception();
        }finally {
            System.out.println(name +"环绕通知方法最终执行完毕");
        }
    }
}
