package com.atguigu.teststatic;

//是否可以从一个静态（static）方法内部发出对非（non-static）方法访问
public class TestStatic {
    //静态变量属于类，不属于实例对象
    //实例变量属于实例对象
    public static void main(String[] args) {
        StaticNum staticNum1 = new StaticNum();

        StaticNum staticNum2 = new StaticNum();
    }
    //otput:
    // a:2b:2
    //a:3b:2


}

class StaticNum {
    private static int a =1;
    private int b = 1;

    public StaticNum(){
        a++;
        b++;
        System.out.println("a:" + a +"b:" + b);
    }

    public static void test1(){
        a++;
//        b++; 不可以
//        test2();
//        是否可以从一个静态（static）方法内部发出对非（non-static）方法访问
    }

    public void test2(){
        b++;
    }


}