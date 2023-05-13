package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

/*
深入研究Collection解集合的contains方法:
    boolean contains(Object o);// 判断集合中是否包含某个对象o
    true:包含  false:不包含

    注意：contains底层会调用equals()方法，所以集合中的对象务必要重写equals方法
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new String("abc"));
        c.add(new String("def"));
        c.add( new Person(1,"张三"));

        // 如果按照集合c中存储的是引用地址来理解，那么会认为是false
        // 其实实际上集合c存储的确实是引用地址，但是实际返回的是true
        // 原因要去分析contain源码，因为contains底层调用了equals()方法
        // 而String重写了equals()方法，故会返回false
        System.out.println(c.contains(new String("abc")));

        // Person类未重写equals方法 导致contains()方法返回false
        System.out.println(c.contains(new Person(1, "张三")));
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }
}
