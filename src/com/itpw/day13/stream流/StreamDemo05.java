package com.itpw.day13.stream流;

import com.itpw.day08.访问控制权限.modify01.F;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    关于Stream流的map
        .map:抽取对象集合中的某个元素组成集合
*/
public class StreamDemo05 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 19, 62D);
        Student s2 = new Student("李四", 23, 78D);
        Student s3 = new Student("哆啦A梦", 42, 150);
        Student s4 = new Student("哆啦D梦", 32, 123D);
        List<Student> stuList = new ArrayList<>();
        Collections.addAll(stuList, s1, s2, s3, s4);

        // new Function<T,V>  T是传入的泛型，V是操作后的目标泛型
        // 需求:将集合中的学生名字修改成java前缀，并且分数都-100
        stuList.stream().map(new Function<Student, Student>() {
            @Override
            public Student apply(Student student) {
                return new Student(
                        "java"+student.getName()
                        ,student.getAge()
                        ,student.getScore()-100D);
            }
        }).forEach(o1-> System.out.println(o1));

        System.out.println("———————————————————————————");

            //lambda优化
        stuList.stream()
                .map(student -> new Student(
                    "java"+student.getName()
                    ,student.getAge()
                    ,student.getScore()-100D))
                .forEach(o1-> System.out.println(o1));

        System.out.println("———————————————————————————");

        // 需求:将集合中的学生名字修改成java前缀，并且分数都-100，再放入Map集合中
        Map<String, String> collect = stuList.stream()
                .map(student -> new Student(
                        "java" + student.getName()
                        , student.getAge()
                        , student.getScore() - 100D))
                .collect(Collectors.toMap(o1 -> o1.getName(), o2 -> o2.getName()));
    }
}
