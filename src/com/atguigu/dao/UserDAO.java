package com.atguigu.dao;

import com.atguigu.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO<User> {
    @Override
    public void save(){
        System.out.println("userdao在保存。。。");
    }
}
