package com.itpw.day05.多态.instatnceof疑惑;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // 多态 List是接口 ArrayList是实现类
        // obj instanceof Class
        // obj 是一个对象，Class 表示一个类或接口。obj 是 class 类（或接口）的实例或者子类实例时返回true
        List ar = new ArrayList();
        System.out.println(ar instanceof List);// true
        System.out.println(ar instanceof ArrayList);// true
        System.out.println(ar instanceof LinkedList);// false
        /*
        结构如下
                   List
            |                |
          Arraylist      LinkedList
        */
    }
}
