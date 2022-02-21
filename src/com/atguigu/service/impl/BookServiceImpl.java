package com.atguigu.service.impl;

import com.atguigu.bean.Book;
import com.atguigu.bean.User;
import com.atguigu.dao.BaseDAO;
import com.atguigu.dao.BookDAO;
import com.atguigu.service.BaseService;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BaseDAO<Book> baseDAO;

    @Override
    public void save() {
        baseDAO.save();
    }

    @Transactional(timeout = 3,noRollbackFor = {ArithmeticException.class},rollbackFor = {FileNotFoundException.class})
    @Override
    public void checkout(String userName,String isbn) throws FileNotFoundException{
        bookDAO.updateStock(isbn);
        int price = bookDAO.getPrice(isbn);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        bookDAO.updateBalance(userName,price);

//        int i = 10/0;
        new FileInputStream("D://WORK");

    }
//
//    @Override
//    public void getBook() {
//        System.out.println("正在获取图书。。。。。。。。");
//    }

//    @Autowired
//    private BaseDAO baseDAO;
//
//    @Override
//    public void getBook() {
//
//    }
//
//    @Override
//    public void save() {
//        baseDAO.save();
//    }
}
