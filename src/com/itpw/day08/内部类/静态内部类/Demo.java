package com.itpw.day08.内部类.静态内部类;

/*
* 静态内部类
* */
public class Demo {
    public static void main(String[] args) {
        // 静态内部类的定义方式，注意和实例内部类定义的区别
        // 1、静态内部类new Outer.Inner()
        // 2、实例内部类new Car().new Engine(); 多一个括号多一个new
        Outer.Inner inner = new Outer.Inner();
        inner.test();
    }
}
