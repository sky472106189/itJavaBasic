package com.itpw.day14.io流.file_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 要求两种方式实现

 1. 使用Sream流实现
 2. 使用正常的java代码实现

合并map1和map2生成新的map3。同时要求key相同时，保留map2的数据，最后把合并后的map3打印出来
*/
public class FileInterview {
    public static void main(String[] args) {
        Map<String, Person> map1 = new HashMap<>();
        map1.put("java基础", new Person("夏哥", 88));
        map1.put("javaSE", new Person("杨宁", 18));

        Map<String, Person> map2 = new HashMap<>();
        map2.put("javaSE", new Person("孙晓威", 99));
        map2.put("javaWeb", new Person("张三", 30));
        map2.put("java框架", new Person("李四", 32));

        // 方法一 使用正常的java代码实现
        Map<String, Person> contactMap = contactMap(map1, map2);
        contactMap.forEach((k, v) -> System.out.println("key= " + k + " value= " + v));

        System.out.println("————————————————————————");

        // 方法二 使用Stream流实现
        Map<String, Person> contactMapByStream = contactMapByStream(map1, map2);
        contactMapByStream.forEach((k, v) -> System.out.println("key= " + k + " value= " + v));
    }

    /**
     * 正常方式实现
     *
     * @param m1
     * @param m2
     * @return
     */
    public static Map<String, Person> contactMap(Map<String, Person> m1, Map<String, Person> m2) {
        Map<String, Person> map = new HashMap<>();
        m1.forEach((k, v) -> map.put(k, v));
        m2.forEach((k, v) -> map.put(k, v));
        return map;
    }

    /**
     * Stream流方式实现
     *
     * @param m1
     * @param m2
     * @return
     */
    public static Map<String, Person> contactMapByStream(Map<String, Person> m1, Map<String, Person> m2) {

        Set<Map.Entry<String, Person>> entry1 = m1.entrySet();
        Set<Map.Entry<String, Person>> entry2 = m2.entrySet();
        Stream<Map.Entry<String, Person>> concat = Stream.concat(entry1.stream(), entry2.stream());
        //然后将其收集成一个新的map,直接合并会报错，因为未指定key相同时的处理方案
        // Map<String, Person> map = concat.collect(Collectors.toMap(o1 -> o1.getKey(), o2 -> o2.getValue()));

        // (v1,v2)-> v2 解释:如果key相同，则用第二个替代
        Map<String, Person> map = concat.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v2));
        return map;
    }
}

class Person {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

