package com.itpw.day13;

import java.util.*;

/*
* 分析HashMap底层put方法源码
* */
public class AnalysePutMethodSource {

    public static void main(String[] args) {

        // String[] str = new String[]{"AaAaAa","AaAaBB","AaBBAa","AaBBBB",
        //         "BBAaAa","BBAaBB","BBBBAa","BBBBBB"};
        // 哈希值都相同
        // for (String s : str) {
        //     System.out.print(s.hashCode());
        // }

        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("AaAaAa", "张三"),"测试1");
        map.put(new Person("AaAaBB", "李四"),"测试2");
        map.put(new Person("AaBBAa", "李四"),"测试3");
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry);
        }
        // map.put(new Person("AaBBBB", "李四"),"测试4");
        // map.put(new Person("BBAaAa", "李四"),"测试5");
        // map.put(new Person("BBAaBB", "李四"),"测试6");
        // map.put(new Person("BBBBAa", "李四"),"测试7");
        // map.put(new Person("BBBBBB", "李四"),"测试8");

    }

}

class Person{
    String id;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return name.equals(person.name);
    }
}
