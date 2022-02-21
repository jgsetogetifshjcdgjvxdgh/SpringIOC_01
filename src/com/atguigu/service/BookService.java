package com.atguigu.service;

import com.atguigu.bean.Book;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

public interface BookService extends BaseService<Book> {

//    void getBook();

    void checkout(String userName,String isbn) throws FileNotFoundException;
}
