package com.itpw.day06.finallearn;

/*
    final修饰引用
        final修饰的变量只能赋一次值
        "引用"也是一个变量
    final指向引用后，便不可再更改。但还是会随着存在的方法的消失而被垃圾回收器回收。
    虽然final不能修改引用，但是引用内部的数据可以更改
*/
public class FinalDemo02 {

    public static void main(String[] args) {
        Person p1 = new Person(18);
        System.out.println(p1.age);
        final Person p = new Person(30);
        //p = new Person(20);// 编译报错
        //p=null;// 赋值null都不行

        // 虽然final修饰的引用不能变，但是引用内部的数据可以变
        p.age = 40;
        System.out.println(p.age);
    }
}

class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}
