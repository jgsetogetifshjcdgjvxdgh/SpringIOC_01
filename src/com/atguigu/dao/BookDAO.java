package com.atguigu.dao;

import com.atguigu.bean.Book;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO extends BaseDAO<Book> {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(){
        System.out.println("bookdao在保存");
    }

    public void updateBalance(String userName,int price){
        String sql = "update account set balance = balance - ? where username = ?";
        jdbcTemplate.update(sql,price,userName);
    }

    public int getPrice(String isbn){
        String sql = "select price from book where isbn = ?";
        return jdbcTemplate.queryForObject(sql,Integer.class,isbn);
    }

    public void updateStock(String isbn){
        String sql = "update book_stock set stock = stock-1 where isbn = ?";
        jdbcTemplate.update(sql,isbn);
    }
}
