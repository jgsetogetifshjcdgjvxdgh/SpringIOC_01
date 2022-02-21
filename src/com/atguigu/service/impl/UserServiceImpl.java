package com.atguigu.service.impl;

import com.atguigu.bean.User;
import com.atguigu.dao.BaseDAO;
import com.atguigu.dao.UserDAO;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private BaseDAO<User> baseDAO;

    @Override
    public void save() {
        baseDAO.save();
    }
//    @Autowired
//    private UserDAO userDAO;
//    @Override
//    public void save(){
//        userDAO.save();
//    }


}
