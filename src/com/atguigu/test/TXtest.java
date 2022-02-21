package com.atguigu.test;

import com.atguigu.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileNotFoundException;

@ContextConfiguration(locations = "classpath:tx.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TXtest {

    @Autowired
    private BookService bookServiceImpl;

    @Test
    public void test1() throws FileNotFoundException {
        bookServiceImpl.checkout("Tom", "ISBN-001");
    }

    @Test
    public void test2() throws FileNotFoundException {
        System.out.println(bookServiceImpl.getClass());
    }

    @Test
    public void test3() throws FileNotFoundException {
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        int c = 1;
        int d = 1;

        Integer e = 1;
        Integer f = 1;

        Integer g = 130;
        Integer h = 130;

        Integer i = new Integer(130);
        Integer j = 130;

        System.out.println(a == b);
        System.out.println(c == d);

        System.out.println(e == f);
        System.out.println(g == h);

        System.out.println(c == e);
        System.out.println(i == j);

        if (g != null & g == h) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (g == null && g != h) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        int[] arr = new int[10];
        System.out.println(arr.length);

//        System.out.println(arr.length());

        System.out.println("test".length());


        byte by = 1;
        switch (by) {
            case (0x04): {
            }
            break;
        }

//        long lo = 1;
//        switch (lo) {
//            case (0x04): {
//            }
//            break;
//        }

        String st = "test";
        switch (st) {
            case ("test"): {
            }
            break;
        }
    }

//    @Test
//    private void test4(){
//        //构造器（constructor）是否可被重写（override）
//
//
//    }
//
//    @Test
//    private void test5(){
//        //TODO
//        //两个对象值相同(x.equals(y) == true)，但却可有不同的hash code，这句话对不对
//    }

    @Test
    public void test6(){
        //String 和StringBuilder、StringBuffer 的区别？
        String s = "testString";
        StringBuilder sb = new StringBuilder("abc");
        sb.append("StringBuilder");
        StringBuffer sbf = new StringBuffer("sbf");

        //String final不可变,+连接字符串时，会新分配内存，效率低；适于少量字符串
        //StringBuilder可变，字符串操作不产生新的对象，线程不安全，速度快；适于单线程大量字符串
        //StringBuffer可变，线程安全，速度慢；适于多线程大量字符串
    }



    @Test
    public void test7(){
        //重载（Overload）和重写（Override）的区别。重载的方法能否根据返回类型进行
        //重载和重写都是多态体现，重写是运行时多态 重载是编译时多态
        //重载是一个类中，方法名相同，方法参数（类型不同，个数不同）不同。重写是子类重写父类方法，方法名，方法参数，返回类型相同
    }

//    描述一下 JVM 加载 class 文件



    @Test
    public void test8(){
        //    char 型变量中能不能存贮一个中文汉字，为什么
        char ch = '中';
        System.out.println(ch);
    }

    @Test
    public void test9(){
        //    抽象类和接口异同

        char ch = '中';
        System.out.println(ch);
    }

    //抽象的（abstract）方法是否可同时是静态的（static）, 是否可同时是本地


    @Test
    public void testGc(){
        System.out.println("hello gc");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test10(){

    }
    //静态变量和实例变量区别






}
