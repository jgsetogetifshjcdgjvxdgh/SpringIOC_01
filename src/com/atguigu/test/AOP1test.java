package com.atguigu.test;

import com.atguigu.proxy.CalculatorProxy;
import com.atguigu.service.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations="classpath:aop1.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AOP1test {
    @Autowired
    private Calculator calculator;

    @Test
    public void test1(){
       calculator.add(1,2);
       calculator.sub(3,4);
       calculator.mul(5,6);
       calculator.div(7,8);

    }

    @Test
    public void test2(){
        Calculator proxy = CalculatorProxy.getProxy(calculator);
//        proxy.add(1,2);
        proxy.div(2,0);

    }

    @Test
    public void test3(){
        calculator.div(2,0);
    }

    @Test
    public void test4(){
        System.out.println(calculator.getClass());

    }
}
