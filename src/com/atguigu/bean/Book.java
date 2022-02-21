package com.atguigu.bean;

import java.util.Objects;
import java.util.SortedSet;

public class Book {
    private String bookName;
    private String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void myInit(){
        System.out.println("我自己的初始化方法。。。。。。。。");
    }

    public void myDestroy(){
        System.out.println("我自己的销毁方法。。。。。。。。。。。");
    }

    public Book() {
        System.out.println("Book创建了");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
