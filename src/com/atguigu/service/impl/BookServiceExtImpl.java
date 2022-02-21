package com.atguigu.service.impl;

import com.atguigu.service.BookServiceExt;
import org.springframework.stereotype.Service;

@Service
public class BookServiceExtImpl implements BookServiceExt {

//    @Override
    public void getBook() {
        System.out.println(" BookServiceExt 正在获取图书。。。。。。。。");
    }

    @Override
    public void save() {

    }

    @Override
    public void checkout(String userName, String isbn) {

    }
}
