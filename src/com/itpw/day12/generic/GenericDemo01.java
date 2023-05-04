package com.itpw.day12.generic;

import java.util.ArrayList;
import java.util.List;

/*
* 初窥泛型
* */
public class GenericDemo01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("java1");
        stringList.add("java2");
        stringList.add("java3");
        stringList.add("java4");
        stringList.add("java5");
        // 没有泛型调用String的replace()方法就会报错 ClassCastException
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i,stringList.get(i).replace("java","JAVA"));
        }
        for (String s : stringList) {
            System.out.println(s);
        }

        /*
        * 对于集合中的泛型为父类，那么所属的子类都能装入
        * 但是自定义类的泛型不支持！ 详情看 类型通配符包中代码
        * */
        List<Object> list = new ArrayList<>();
        list.add("123");
        list.add(123);
        list.add(123.0F);
        list.add(123.00);

    }
}