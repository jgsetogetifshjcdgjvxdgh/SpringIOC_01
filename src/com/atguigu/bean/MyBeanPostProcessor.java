package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class MyBeanPostProcessor implements BeanPostProcessor {
     public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "将要在初始化方法前调用了。。。" + beanName);
        return bean;
    }

     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName + "将要在初始化方法后调用了。。。" + beanName);
        return bean;
    }
}
