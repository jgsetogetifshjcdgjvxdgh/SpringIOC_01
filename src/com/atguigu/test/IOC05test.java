package com.atguigu.test;

import com.atguigu.bean.Book;
import com.atguigu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC05test {

    ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("ioc5.xml");

//    @Test
//    public void test1(){
//        Person person = (Person) ioc.getBean("person01");
//        System.out.println(person.getCar());
//    }

    @Test
    public void test2(){
        Person person = (Person) ioc.getBean("person02");
        System.out.println(person.getName() + person.getGender() + person.getCar() + person.getProperties());
    }

    @Test
    public void test3(){
        Person person = (Person) ioc.getBean("person03");
        System.out.println(person.getName() + person.getGender() + person.getCar() + person.getProperties());
    }

    @Test
    public void test4(){
        Person person = (Person) ioc.getBean("person04");
        System.out.println(person.getName() + person.getGender() + person.getCar() + person.getProperties());
    }
}
