package com.atguigu.testCollection;

import java.util.*;

public class MyCollection {
//    List<Integer> list = new List();

    //Collection是接口，List和Set是接口，ArrayList和LinkedList是具体实现

    //底层是数组，查找快，插入删除慢。线程不安全
    ArrayList<Integer> arr = new ArrayList<>(10);
    ArrayList arrayList1 = new ArrayList();

    //底层是链表，查找慢，插入删除快。线程不安全
    LinkedList<Integer> linkedList = new LinkedList<>();
    LinkedList linkedList1 = new LinkedList();

    //有synchronized修饰符，线程安全
    Vector<Integer> vector = new Vector<>();

    public static void testVector(){
        Vector<String> v = new Vector<>();
        v.add("vector");

        Enumeration<String> elements = v.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }

    public void testArrayList(){
        arr.size();
        linkedList.size();
        vector.size();
    }
    //list：有序，可重复
    ///////////////////////////////////////

//    Set s = new Set();
    Set<String> s1 = new HashSet<>();//存取顺序不一致 无序
    Set<String> s2 = new LinkedHashSet<>();//存取顺序一致 无序
    Set<String> s3 = new TreeSet<>();//有序 实现了Comparable接口，重写compareto方法

    public void testSet(){
        s1.size();
        s2.size();
    }

    //无序 元素不可重复
    ///////////////////////

//    Map<Integer,String> m = new Map<>();
    Map<Integer,String> m1 = new HashMap<>();//unsynchronized and permits nulls 不同步，允许空
    Map<Integer,String> m2 = new LinkedHashMap<>();
    Map<Integer,String> m3 = new TreeMap<>();//Note that this implementation is not synchronized 不同步
    Map<Integer,String> m4 = new Hashtable<>();//同步

    Object object = new Object();





    public static void main(String[] args){
        testVector();
    }


}
