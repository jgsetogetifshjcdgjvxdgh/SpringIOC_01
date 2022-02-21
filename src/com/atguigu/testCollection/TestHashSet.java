package com.atguigu.testCollection;

import com.atguigu.bean.Book;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        Book book1 = new Book("dtt", "dtt");
        Book book2 = new Book("dyy", "dyy");
        Book book3 = new Book("dyy", "dyy");

        HashSet<Book> hashSet = new HashSet<>();
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        for (Book item : hashSet) {
            System.out.println(item.getBookName());
        }
        //Book未重写hashcode和equals方法时，
        //dtt
        //dyy
        //dyy


        //Book重写hashcode和equals方法时，
        //dtt
        //dyy

        int i1 = 10;
        int i2 = 10;

        String s1 = new String("dtt");
        String s2 = new String("dtt");

        String s3 = "dtt";
        String s4 = "dtt";

        System.out.println("i1==i2?" + (i1 == i2));
        System.out.println("s1==s2?" + (s1 == s2));
        System.out.println("s3==s4?" + (s3 == s4));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        //前提条件：
        //Object:
        //hashcode() 本地方法，返回地址
        //equals() 比较对象地址是否相等

        //重写方法
        //hashcode() 根据对象成员变量，计算出一个值
        //equals() 比较成员变量是否相等

        //==和equals区别
        //==：
        //1、基本数据类型是比较基本数据值是否相等
        //2、引用类型，比较对象的地址是否相等
        //equals:
        //1、比较两个对象的地址是否相等
        //2、自定义对象重写了equals方法，会比较对象成员变量是否相等

        //String特殊
        //String s1 = "dtt";String s2 = "dtt"; 相等，因为"dtt"在常量池，地址指向同一个
        //String s1 = "dtt";String s2 = new String("dtt"); 按理不相等，但String 自己重写了equals方法，相等

    }
}
