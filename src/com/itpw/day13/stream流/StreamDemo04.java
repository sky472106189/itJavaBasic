package com.itpw.day13.stream流;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 19, 62D);
        Student s2 = new Student("李四", 23, 78D);
        Student s3 = new Student("哆啦A梦", 42, 150);
        Student s4 = new Student("哆啦D梦", 32, 123D);
        List<Student> stuList = new ArrayList<>();
        Collections.addAll(stuList, s1, s2, s3, s4);

        // 需求1、计算出分数超过50的学生有几个人
        // count方法
        long count = stuList.stream()
                .filter(o1 -> o1.getScore() > 50)
                .count();
        System.out.println(count);

        System.out.println("——————————————");

        // 需求2、找出分数最高的学生
        Optional<Student> max = stuList.stream()
                .max((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()));
        // Optional类java8用于判空的一个类
        // ifPresent() 如果有，就打印
        max.ifPresent(student -> System.out.println(student));

        System.out.println("——————————————");

        // 需求3、找出分数最小的学生对象并输出
        // get方法
        Student student = stuList.stream()
                .min((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()))
                .get();
        System.out.println(student);

        System.out.println("——————————————");

        // 需求4、找出分数超过75的学生，并放入新集合
        Stream<Student> studentStream = stuList.stream().filter(o1 -> o1.getScore() >= 75);
        List<Student> collect1 = studentStream.collect(Collectors.toList());
        System.out.println(collect1);

        System.out.println("——————————————");

        // 补充：流只能收集一次
        // List<Student> collect2 = studentStream.collect(Collectors.toList());
        // System.out.println(collect2); // 全部打印出来，过滤实效了

        System.out.println("——————————————");

        // 需求5、将分数超过80的学生，放入Map集合,其中key=name,value=Score
        stuList.stream()
                .filter(o1->o1.getScore()>=80)
                .collect(Collectors.toMap(o1->o1.getName(),o1->o1.getScore()))
                .forEach((k,v)-> System.out.println(k+"---"+v));
    }
}
