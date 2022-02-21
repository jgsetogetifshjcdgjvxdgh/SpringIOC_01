package com.atguigu.test;

import com.atguigu.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC02test {
//    @Test
//    public void test1(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person = (Person) ioc.getBean("person01");
//
//        System.out.println(person.getCar().getCarName());
//        Car car = (Car)ioc.getBean("car01");
//        System.out.println(person.getCar() == car);
//        car.setCarName("摩托");
//        System.out.println(person.getCar().getCarName());
//        System.out.println(car.getCarName());
//
//    }

//    @Test
//    public void test2(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person2 = (Person) ioc.getBean("person02");
//
//        System.out.println(person2.getCar().getCarName());
//        Car car1 = (Car)ioc.getBean("car01");
//        System.out.println(person2.getCar() == car1);
//
//        person2.getCar().setCarName("修改后的宝马02");
//        System.out.println(person2.getCar().getCarName());
//        System.out.println(car1.getCarName());
//
//    }

//    @Test
//    public void test3(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person3 = (Person) ioc.getBean("person03");
//
//        List<Book> list = person3.getBookList();
//        System.out.println((list);
//
//    }

//    @Test
//    public void test4(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person4 = (Person) ioc.getBean("person04");
//
//        System.out.println((person4.getMaps().get("keycar").toString()));
//
//    }

//    @Test
//    public void test5(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person5 = (Person) ioc.getBean("person05");
//
//        System.out.println((person5.getProperties().getProperty("key01")));
//
//    }

//    @Test
//    public void test6(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person6 = (Person) ioc.getBean("person06");
//
//        System.out.println((person6.getMaps()));
//
//    }

//    @Test
//    public void test7(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person7 = (Person) ioc.getBean("person07");
//
//        System.out.println((person7.getCar().getPrice()));
//
//    }

//    @Test
//    public void test8(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
//        Person person9 = (Person) ioc.getBean("person09");
//
//        System.out.println((person9.getGender()));
//
//    }

    @Test
    public void test10(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
        Person person10 = (Person) ioc.getBean("person10");

        System.out.println((person10.getGender()));

    }

}
