package com.atguigu.factory;

import com.atguigu.bean.Book;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBeanImpl implements FactoryBean<Book> {
    @Override
    public Book getObject() throws Exception {
        System.out.println("MyFactory正为你创建Book。。。。。。。。。。。。");
        Book book = new Book();
        book.setBookName("我自己创建的Book");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
