package com.itpw.day13.集合.map.entryset疑惑;

import java.util.HashSet;
import java.util.Set;

/*
 解决Set<Map.Entry<K,V>> entrySet();方法的疑惑
  1、什么是Map.Entry<K,V>？
        就是一个Map中的静态内部类，可以看做本例的MyClass.InnerClass
  2、Map.Entry<K,V>是一个接口，在HashMap中被Node<K,V>实现
*/
public class Demo {
    public static void main(String[] args) {
        // 静态内部类也是一个类，可以作为泛型传入
        // 说明Set集合中存储的是InnerClass对象
        Set<MyClass.InnerClass> set = new HashSet<>();

    }
}
