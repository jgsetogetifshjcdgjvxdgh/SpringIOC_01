package com.atguigu.dao;

import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseDAO<T> {
    public abstract void save();

}
