package com.itpw.day13.集合.collection.set_3.treeset;

import java.util.Set;
import java.util.TreeSet;

/*
  TreeSet:无序不可重复，但是存储的元素可以自动按照大小顺序排序，又叫可排序集合
      无序：存入的顺序和取出的顺序无关。但是TreeSet会自动排好序

    1、TreeSet集合底层实际上是一个TreeMap
    2、TreeMap集合底层是一个二叉树.
    3、放到TreeSet集合中的元素,等同于放到TreeMap集合key部分了.
    4、TreeSet集合中的元素:无序不可重复,但是可以按照元素的大小顺序自动排序,称为可排序集合.
    5、TreeSet默认升序.

*/
public class TreeSetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("Z");
        set.add("C");
        set.add("D");
        set.add("M");
        // 结果已自动排序
        for (String s : set) {
            System.out.print(s+"\t");
        }

    }
}
