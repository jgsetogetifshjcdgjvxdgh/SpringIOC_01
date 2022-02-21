package com.atguigu.service.impl;

import com.atguigu.service.Calculator;
import com.atguigu.utils.LogUtil;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i,int j) {
//        System.out.println("add方法开始，参数为"+ i+j);
//        LogUtil.log(i,j);
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i,int j) {
//        System.out.println("sub方法开始，参数为"+ i+j);
//        LogUtil.log(i,j);
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i,int j) {
//        System.out.println("mul方法开始，参数为"+ i+j);
//        LogUtil.log(i,j);
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i,int j) {
//        System.out.println("div方法开始，参数为"+ i+j);
//        LogUtil.log(i,j);
        int result = i / j;
        return result;
    }
}
