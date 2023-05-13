package com.itpw.day13.集合.collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 集合遍历中
 *   String不能改，但是能改对象中String类型的元素
 * 分析可见同名图JVM模型分析
 * */
public class CollectionTest08 {
    public static void main(String[] args) {
        System.out.println("-----------------直接对类中的String修改-----------------------------------");
        List<AnClass> c = new ArrayList<>();
        c.add(new AnClass(1, "张三"));
        c.forEach(p -> {
            // 两种方式都可以
            p.name = "王五";
            // p.setName("王五");
        });
        for (AnClass anClass : c) {
            System.out.println(anClass);
        }

        System.out.println("--------------------直接对String修改-----------------------------------");

        Collection<String> stringList = new ArrayList<>();
        stringList.add("123");
        for (String s : stringList) {
            s = "345";  //不生效
        }
        for (String s : stringList) {
            System.out.println(s);
        }

    }
}

class AnClass {
    int id;
    String name;

    @Override
    public String toString() {
        return "AnClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public AnClass() {
    }

    public AnClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
