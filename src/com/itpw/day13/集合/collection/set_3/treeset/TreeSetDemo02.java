package com.itpw.day13.集合.collection.set_3.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(21);
        Person p3 = new Person(19);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        for(Person i:personSet)
            System.out.println(i);//运行错误
    /*  java.lang.ClassCastException:
              Map.TreeMap.Person cannot be cast to java.lang.Comparable */
        //Person类没有比较规则
    }
}

class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[age="+age+"]";
    }
}


