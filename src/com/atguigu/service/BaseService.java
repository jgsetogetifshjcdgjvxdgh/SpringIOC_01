package com.atguigu.service;

import com.atguigu.dao.BaseDAO;
import org.springframework.beans.factory.annotation.Autowired;

public interface BaseService<T> {
    void save();
}
