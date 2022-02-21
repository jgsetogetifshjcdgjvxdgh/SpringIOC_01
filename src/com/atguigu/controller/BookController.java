package com.atguigu.controller;

import com.atguigu.service.BookService;
import com.atguigu.service.BookServiceExt;
import com.atguigu.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class BookController {


//    @Autowired
//    private BookService bookService;

//    @Autowired(required = false)
//    @Qualifier("bookServiceImpltest")
//    private BookService bookServiceExtImpl2;
//
//    public void getBook(){
////        bookService.getBook();
//        bookServiceExtImpl2.getBook();
//    }

//    @Autowired
//    public void test(BookService bookServiceImpl){
//        bookServiceImpl.getBook();
//    }
}
