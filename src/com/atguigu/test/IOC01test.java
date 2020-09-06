package com.atguigu.test;

import com.atguigu.com.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC01test {
//    @Test
//    public void test1(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = (Person) ioc.getBean("person01");
////        System.out.println(person.getName());
//
//        Person person1 = (Person) ioc.getBean("person01");
//
//        System.out.println(person == person1);
//
//        Person person3 = (Person) ioc.getBean("person03");
//    }

//    @Test
//    public void test2(){
////        根据bean的类型从IOC容器中获取bean的实例★
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
////        Person person = ioc.getBean(Person.class);
////        System.out.println(person.getName());
//
//        Person person2 = ioc.getBean("person02",Person.class);
//        System.out.println(person2.getName());
//
//    }

//    @Test
//    public void test3(){
////        根据bean的类型从IOC容器中获取bean的实例★
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
////        Person person = ioc.getBean(Person.class);
////        System.out.println(person.getName());
//
//        Person person3 = ioc.getBean("person03",Person.class);
//        System.out.println(person3.getName());
//
//    }

//    @Test
//    public void test4(){
////        根据bean的类型从IOC容器中获取bean的实例★
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
////        Person person = ioc.getBean(Person.class);
////        System.out.println(person.getName());
//
//        Person person4 = ioc.getBean("person04",Person.class);
//        System.out.println(person4.getName());
//
//    }

    @Test
    public void test5(){
//        根据bean的类型从IOC容器中获取bean的实例★
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = ioc.getBean(Person.class);
//        System.out.println(person.getName());

        Person person5 = ioc.getBean("person05",Person.class);
        System.out.println(person5.getName());

    }
}
