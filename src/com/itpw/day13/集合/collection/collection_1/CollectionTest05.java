package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection解集合的remove方法:

*/
public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        String s2 = new String("abc");
        c.add(s1);
        c.add(s2);
        String s3 = new String("abc");
        // remove底层遍历集合，并调用equals方法，如何equals返回true就删除并弹出方法栈（）
        c.remove(s3);
        System.out.println(c.size());// 1
    }
}
