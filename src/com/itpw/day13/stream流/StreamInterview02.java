package com.itpw.day13.stream流;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
要求两种方式实现
1. 使用Stream流实现
2. 使用正常的java代码实现
需求:
    map1和map2生成新的map3。同时要求key相同时，保留map2的数据，最后把合并后的map3打印出来
正确输出结果:
    key= java基础 value= Student{name='夏哥', age=88}
    key= javaWeb value= Student{name='张三', age=30}
    key= javaSE value= Student{name='孙晓威', age=99}
    key= java框架 value= Student{name='李四', age=32}
*/
public class StreamInterview02 {

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
        contactMap.forEach((k,v)-> System.out.println("key= "+k+" value= "+v));

        System.out.println("————————————————————————");

        // 方法二 使用Stream流实现
        Map<String, Person> contactMapByStream = contactMapByStream(map1, map2);
        contactMapByStream.forEach((k,v)->System.out.println("key= "+k+" value= "+v));
    }

    /**
     * 正常方式实现
     * @param m1
     * @param m2
     * @return
     */
    public static Map<String,Person> contactMap(Map<String,Person> m1,Map<String,Person> m2){
        Map<String,Person> map = new HashMap<>();
        m1.forEach((k,v)->map.put(k,v));
        m2.forEach((k,v)->map.put(k,v));
        return map;
    }

    /**
     * Stream流方式实现
     * @param m1
     * @param m2
     * @return
     */
    public static Map<String,Person> contactMapByStream(Map<String,Person> m1,Map<String,Person> m2){

        //将map1和map2收集成一个流
        Set<Map.Entry<String, Person>> entry1 = m1.entrySet();
        Set<Map.Entry<String, Person>> entry2 = m2.entrySet();
        Stream<Map.Entry<String, Person>> concat = Stream.concat(entry1.stream(), entry2.stream());
        //然后将其收集成一个新的map,直接合并会报错，因为未指定key相同时的处理方案
        // Map<String, Person> map = concat.collect(Collectors.toMap(o1 -> o1.getKey(), o2 -> o2.getValue()));

        // (v1,v2)-> v2 解释:如果key相同，则用第二个id的值替代
        Map<String, Person> map = concat.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v2));
        return map;
    }
}

class Person {
    // 姓名
    private String name;
    // 年龄
    private int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
