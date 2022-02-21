package com.atguigu.test;

import com.atguigu.bean.Book;
import com.atguigu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC03test {

    ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("ioc3.xml");

//    @Test
//    public void test2(){
//     Person person01 = (Person) ioc.getBean("person02");
//     Person person02 = (Person) ioc.getBean("person02");
//
//
//     System.out.println(person01 == person02);
//    }

//    @Test
//    public void test3(){
//        Person person01 = (Person) ioc.getBean("person03");
//        Person person02 = (Person) ioc.getBean("person03");
//
//
//        System.out.println(person01 == person02);
//    }

//    @Test
//    public void test4(){
//        System.out.println("容器启动完成");
//    }

//    @Test
//    public void test5(){
//        System.out.println("容器启动完成");
//
//    }
//
//    @Test
//    public void test6(){
//        System.out.println("容器启动完成");
////        Book book01= (Book)ioc.getBean("myFactoryBean01");
////        Book book02= (Book)ioc.getBean("myFactoryBean01");
////        System.out.println(book01 == book02);
//
//    }

//    @Test
//    public void test7(){
//        System.out.println("容器启动完成");
//        ioc.getBean("book_lifeCycle");
////        Book book02= (Book)ioc.getBean("myFactoryBean01");
////        System.out.println(book01 == book02);
//        ioc.close();
//
//    }

    @Test
    public void test8(){
        System.out.println("容器启动完成");
        ioc.getBean("myBeanPostProcessor");
        ioc.getBean("book_myBeanPostProcessor");
    }
}
