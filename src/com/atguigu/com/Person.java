package com.atguigu.com;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private String name = "小明";
    private String gender;

    private Car car;

    private List<Book> bookList;

    private Map<String, Object> maps;

    private Properties properties;

    public Person() {
        System.out.println("Person创建了");
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name 赋值为" + name);
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", car=" + car +
                ", bookList=" + bookList +
                ", maps=" + maps +
                ", properties=" + properties +
                '}';
    }
}
