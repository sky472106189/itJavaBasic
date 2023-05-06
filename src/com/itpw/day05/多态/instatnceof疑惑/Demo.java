package com.itpw.day05.多态.instatnceof疑惑;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // 多态 List是接口 ArrayList是实现类
        // 语法：obj instanceof Class
        // 含义：obj 是一个对象，Class 表示一个类或接口。
        //       若obj 是 类（或接口）的实例或者子类实例时返回true
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

    public static void funcForInstanceof(){
        B b = new D();
        System.out.println(b instanceof A1);//true
        System.out.println(b instanceof A2);//true
        System.out.println(b instanceof B); //true
        System.out.println(b instanceof C1);//true
        System.out.println(b instanceof C2);//false
        System.out.println(b instanceof D); //true
        System.out.println(b instanceof E); //false

    }
}

interface A1 {}

interface A2 {}

interface B extends A1,A2{}

class C1 implements B{}

class C2 implements B{}

class D extends C1{}

class E{}
