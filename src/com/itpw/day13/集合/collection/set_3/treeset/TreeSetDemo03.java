package com.itpw.day13.集合.collection.set_3.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
   自定义类的排序方法
   1、实现Comparable接口
   2、通过匿名内部类Comparator

   结论:
       放到TreeSet或者TreeMap集合key部分的元素要想排序,包括两种方式:
           第一种:放在集合中的元素实现java.lang.Comparable接口.
           第二种:在构造TreeSet或者TreeMap集合的时候,给它传一个比较器对象.

   Comparable和Comparator怎么选择呢?
       当比较规则不会发生改变的时候,或者说当比较规则只有一个的时候,建议实现Comparable接口
       如果比较规则有多个,并且需要多个比较规则之间频繁切换,建议使用Comparator接口.

   Comparator接口的设计符合OCP原则.

   TODO:Comparable接口 和 Comparator接口的区别是什么?
   0.策略模式 可以做了解
   1.Comparable——able 才能。 可以理解为这个类天生就有了这个功能,对功能的抽象，实现了此接口就能比较
   2.Comparator——tor(constructor) 建造者，可以理解为在新建的时候，才赋予的能力。既在使用时才给
   3.同样的体现类似在迭代器iterator和iterable的区别
     3.1 iterable是一个接口，其子类都能执行iterator()方法创造一个迭代器iterator
     3.1 比如Collection接口就是iterable的子类，实现了iterator()等其他方法
*/
public class TreeSetDemo03 {
    public static void main(String[] args) {
        //1、实现Comparable接口
        Set<PersonA> set1 = new TreeSet<>();
        set1.add(new PersonA(10));
        set1.add(new PersonA(9));
        set1.add(new PersonA(15));
        set1.add(new PersonA(0));
        for (PersonA personA : set1) {
            System.out.println(personA);
        }

        System.out.println("——————使用第二种方式—————————————");

        //2、匿名内部类 (给构造方法传递一个比较器)
        Set<PersonA> set2 = new TreeSet<>(new Comparator<PersonA>() {
            @Override
            public int compare(PersonA o1, PersonA o2) {
                return o1.age-o2.age;
            }
        });
        //使用lambda优化
        Set<PersonA> set3 = new TreeSet<>((o1,o2)-> o1.age - o2.age);
        set3.add(new PersonA(-2));
        set3.add(new PersonA(4));
        set3.add(new PersonA(-99));
        set3.add(new PersonA(25));
        for (PersonA personA : set3) {
            System.out.println(personA);
        }

    }
}
class PersonA implements Comparable<PersonA>{
    int age;


    // compareTo方法的返回值很重要:
    //     返回 0 表示相同,value会覆盖
    //     返回 >0 会继续在右子树上找
    //     返回 <0 会继续在左子树上找
    @Override
    public int compareTo(PersonA o) {
        return age - o.age;
    }

    public PersonA(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[age="+age+"]";
    }
}
