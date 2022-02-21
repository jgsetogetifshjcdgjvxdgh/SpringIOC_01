package com.atguigu.proxy;

import com.atguigu.service.Calculator;
import com.atguigu.utils.LogUtil;
import org.apache.commons.logging.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {

//    public static Calculator getProxy(Calculator calculator){
//        InvocationHandler h = new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) {
//                System.out.println(method + "方法执行前, 参数为" + Arrays.asList(args));
//                try{
//                    Object result = method.invoke(calculator,args);
//                    System.out.println(method + "方法执行前, 结果为" + result);
//                    return result;
//                }catch (Exception e){
//                    System.out.println(method + "方法执行异常, 原因为" + e.getCause());
//                }finally {
//                    System.out.println(method + "方法最终执行完成" );
//                }
//                return null;
//            }
//        };
//
//        ClassLoader loader = calculator.getClass().getClassLoader();
//        Class<?>[] interfaces = calculator.getClass().getInterfaces();
//
//        Object proxy = Proxy.newProxyInstance(loader,interfaces,h);
//        return  (Calculator) proxy;
//    }

    public static Calculator getProxy(Calculator calculator){
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                LogUtil.start(method,args);
                try{
                    Object result = method.invoke(calculator,args);
                    LogUtil.after(method,result);
                    return result;
                }catch (Exception e){
                    LogUtil.getException(method,e);
                }finally {
                    System.out.println(method + "方法最终执行完成" );
                }
                return null;
            }
        };

        ClassLoader loader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        Object proxy = Proxy.newProxyInstance(loader,interfaces,h);
        return  (Calculator) proxy;
    }
}
