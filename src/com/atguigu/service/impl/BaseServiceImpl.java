package com.atguigu.service.impl;

import com.atguigu.bean.Book;
import com.atguigu.bean.User;
import com.atguigu.dao.BaseDAO;
import com.atguigu.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    private BaseDAO<User> baseDAO;

    @Autowired
    private BaseDAO<Book> bookDAO;

    @Override
    public void save() {
        baseDAO.save();
        bookDAO.save();
    }
}
