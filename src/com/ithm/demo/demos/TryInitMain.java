package com.ithm.demo.demos;

public class TryInitMain {
    public static void main(String[] args) {
        // 子类的无参构造方法 会直接调用到 父类的无参构造方法
        // 所以会执行父类无参构造方法中 setX(100)方法
        // 为什么呢？
        // 因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化。
        // 如果父类中没有无参构造函数, 那么子类的构造函数内必须通过 super 语句指定要调用的父类中的构造函数.
        ChildClass cc = new ChildClass();
        cc.printX();
    }
}