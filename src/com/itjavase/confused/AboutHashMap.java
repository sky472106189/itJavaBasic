package com.itjavase.confused;

import java.util.HashMap;
import java.util.Objects;

/*
* HashMap中数据+链表的结构
*   hashcode比较的值就是数组下标，如果下标相同，接着执行equals()方法，如果返回false(不相同)
* 则和同下标位置元素成为链表，注意当链表长度超过8时,链表转换为红黑树。
* */
public class AboutHashMap{
    public static void main(String[] args) {
        HashMap<Animal,Integer> map = new HashMap<>();
        map.put(new Animal(1,"鹦鹉"),1);
        map.put(new Animal(2,"yingwu"),1);
        map.put(new Animal(1,"小猫"),1);
    }
}

class Animal{
    int id;
    String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
