package com.itpw.day13.集合.collection.list_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
测试List接口常用的方法
    1.List集合存储的元素特点:有序可重复
        有序:List集合存储的元素有下标.
            从0开始,以1递增.
        可重复:存储一个1,还可以再存储1.
    2.List既然是Collection接口的子接口,必然有它独特的方法.
        以下只列出List特有且常用的方法:
            void add(int index,E element)
            E  get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            E remove(int index)
            E set(int index,E element)
*/
public class ListDemo01 {
    public static void main(String[] args) {
        // 如果用Collection来创建 就无法调用List接口中特有的方法
        // 因为List接口是Collection接口的子类，会比父类更多个性化
        // 也就是Collection接口有的功能，List也有，所以往后都用List来建立集合最佳
        // Collection list = new ArrayList();// 不推荐，丢失了一些方法如get(),set()

        List list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("A");
        list.add(1,"A");// 指定处添加元素，其余元素后移一位

        // 迭代
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 获取指定对象第一次出现处的索引 indexOf
        System.out.println(list.indexOf("C"));
        // 最后一次出现处的索引 lastIndexOf
        System.out.println(list.lastIndexOf("A"));

    }
}
