package com.itjavase.homework;

import java.util.HashMap;
import java.util.Map;

/*
- 使用TreeMap集合保存学生对象信息,要求创建不低于五个学生对象
- 集合添加元素时，要求以学生对象为键,住址为值
- TreeMap集合按照学生的年龄从大到小排序后，遍历集合并输出键值内容，输出格式不做要求
*/
public class Test {
    public static void main(String[] args) {
        Map<String, Student> map1 = new HashMap<>();
        map1.put("java基础", new Student("夏哥", 88));
        map1.put("javaSE", new Student("杨宁", 18));

        Map<String, Student> map2 = new HashMap<>();
        map2.put("javaSE", new Student("孙晓威", 99));
        map2.put("javaWeb", new Student("张三", 30));
        map2.put("java框架", new Student("李四", 32));

    }
}

class Student {
    // 姓名
    private String name;
    // 年龄
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name,  int age) {
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

