package com.itjavase.confused.demos;

/*
    在对子类对象进行初始化时，父类的构造函数也会运行。
    那是因为子类的构造函数默认第一行有一条隐式的语句super()；
*/
public class TryInitMain {
    public static void main(String[] args) {
        // 子类的无参构造方法 会直接调用到 父类的无参构造方法
        // 如果子类构造方法不存在this 或者super 就会默认存在super()语句
        // 所以会执行父类无参构造方法中 setX(100)方法
        // 为什么呢？
        // 因为父类中的数据子类可以直接获取，所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化。
        // 如果父类中没有无参构造函数, 那么子类的构造函数内必须通过 super 语句指定要调用的父类中的构造函数.
        ChildClass cc = new ChildClass();
        cc.printX();
    }
}
