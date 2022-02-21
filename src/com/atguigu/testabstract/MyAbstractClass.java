package com.atguigu.testabstract;

public abstract class MyAbstractClass {
    private String name;

    MyAbstractClass(String name){
        this.name = name;
    }

    //不可以定义成private
//    private abstract void getJob1();

    //不可以定义成private
    protected abstract void getJob2();

    //不可以定义成private
//    default abstract void getJob3();

    //不可以定义成private
    public abstract void getJob4();

    public void sayHello(){
        System.out.println("sayhello");
    }

//    public abstract static void testStatic();
//
//    public abstract native void testNative();
//
//    public abstract synchronized void testSychronized();


}
