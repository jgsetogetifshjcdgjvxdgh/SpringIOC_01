package com.atguigu.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogUtil {
    public static void log(Object...objects){
        System.out.println("***方法开始，参数为" + Arrays.asList(objects));
    }

    public static void start(Method method, Object... args){
        System.out.println(method + "方法执行前, 参数为" + Arrays.asList(args));
    }

    public static void after(Method method, Object result){
        System.out.println(method + "方法执行后, 结果为" + result);
    }

    public static void getException(Method method,Exception e){
        System.out.println(method + "方法执行异常, 原因为" + e.getCause());
    }
}
