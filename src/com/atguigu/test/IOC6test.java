package com.atguigu.test;

import com.atguigu.dao.UserDAO;
import com.atguigu.service.BookService;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.BookServiceImpl;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations="classpath:ioc6.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IOC6test {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

//    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc6.xml");
//    @Test
//    public void test1(){
////        BookDAO bookDAO = (BookDAO) ioc.getBean("bookDAO");
//        BookController bookController = (BookController) ioc.getBean("bookController");
//        BookServiceImpl bookServiceImpl = (BookServiceImpl) ioc.getBean("bookServiceImpl");
//        System.out.println(bookController.toString() + bookServiceImpl.toString());
//    }
//
//    @Test
//    public void test2(){
////        BookDAO bookDAO = (BookDAO) ioc.getBean("bookDAO");
//        BookController bookController = (BookController) ioc.getBean("bookControllertest");
//        BookController bookController2 = (BookController) ioc.getBean(BookController.class);
//        System.out.println(bookController.toString());
//        System.out.println(bookController2.toString());
//    }
//
//    @Test
//    public void test3(){
//        BookServiceImpl bookServiceImpl = (BookServiceImpl) ioc.getBean("bookServiceImpl");
//        System.out.println(bookServiceImpl.toString());
//    }
//
////    @Test
////    public void test4(){
////        BookController bookController = (BookController) ioc.getBean("bookController");
////        bookController.getBook();
////    }

//    @Test
//    public void test5(){
//        BookController bookController = (BookController) ioc.getBean("bookController");
//
////        bookController.test();
//    }

//    @Test
////    public void test7(){
////       bookServiceImpl.getBook();
////    }

    @Test
    public void test8(){
        bookService.save();
        userService.save();

    }
}
