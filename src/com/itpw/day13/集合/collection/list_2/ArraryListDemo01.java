package com.itpw.day13.集合.collection.list_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
ArrayList集合：
    1.默认初始化容量10
    2.集合底层是一个Object[]数组
    3.构造方法
        new ArrayList();
        new ArrayList(int initialCapacity);
    4.ArrayList集合的扩容:
        原容量的1.5倍,
        ArrayList集合底层是数组,怎么优化?
            尽可能少的扩容,因为数组扩容效率比较低,建议在使用ArrayList集合的时候,
            预估计个数,给定初始化容量
    5.优缺点和数组一样:
        检索效率高,增删效率低
    6.向数组末尾添加元素O(1)，效率很高，不受影响
*/
public class ArraryListDemo01 {
    public static void main(String[] args) {
        // 1、无参构造器，
        // 默认初始化容量是10
        List list = new ArrayList();
        //集合size()方法是获取【当前】集合中元素的个数,不是获取集合的容量.
        System.out.println(list.size());//0

        // 2、有参构造，参数为int
        //指定初始化容量,20
        List list2 = new ArrayList(20);


        // 3、有参构造，参数为集合
        Set insertSet = new HashSet<>();
        insertSet.add(100);
        insertSet.add(150);
        insertSet.add(1);
        insertSet.add(20);
            // 通过此构造方法可以将HashSet集合转换为List集合
        List myList3 = new ArrayList(insertSet);
        for (Object o : myList3) {
            System.out.println(o);
        }
    }

    // 集合方法演示
    public static void demo(){

    }
}
