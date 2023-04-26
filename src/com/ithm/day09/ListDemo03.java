package com.ithm.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/***
 * 将集合内年龄低于18的学生对象找出并存入新集合对象
 * 方法返回新集合
 */
public class ListDemo03 {
    public static void main(String[] args) {
        Person p1 = new Person(new Random().nextInt(40)+1);
        Person p2 = new Person(new Random().nextInt(40)+1);
        Person p3 = new Person(new Random().nextInt(40)+1);
        Person p4 = new Person(new Random().nextInt(40)+1);
        System.out.println("处理前数据");
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        for (Person p : personList) {
            System.out.println(p);
        }
        List<Person> ageBelow18 = ListDemo03.findAgeBelow18(personList);
        System.out.println("处理后数据");
        for (Person p : ageBelow18) {
            System.out.println(p);
        }
    }

    public static List<Person> findAgeBelow18(List<Person> personList){
        List<Person> resList = new ArrayList<>();
        for (Person p : personList) {
            if (p.getAge() < 18) {
                resList.add(p);
            }
        }
        return resList;
    }
}

class Person{
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }
}
