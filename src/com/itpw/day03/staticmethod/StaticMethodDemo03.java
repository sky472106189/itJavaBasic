package com.itpw.day03.staticmethod;

/*
* 同一个类中静态和实例的调用问题
*   1、实例方法能调用静态方法和静态变量。
*   2、静态方法只能调用静态方法和静态变量，无法调用实例方法和实例变量
* */
public class StaticMethodDemo03 {

    public static void main(String[] args) {

    }

    public static String staticName;
    public String name;

    public void func1(){
        // this.可以省略，但是最好别省
        System.out.println(this.name);// 不推荐
        System.out.println(name);// 推荐
        // this.staticName 可行，但是不推荐，对所有的静态变量都不应该使用this.
        System.out.println(this.staticName);    // 不推荐
        System.out.println(staticName);  // 推荐

        // 同一个类中的实例方法，前面的this.可以省略，但是最好别省
        // 为什么？为了增强代码的可读性，让程序员知道func2()是一个实例方法
        this.func2();

        // 同一个类中的静态方法，可以省略前面的【类名.】,但是最好省，因为我看一些源码调用本
        // 类静态方法就是直接用的。其实这个并不是强制要求，我看源码也有用类名.的
        // Integer的toString方法中实例就调用了静态，直接用的方法名
        StaticMethodDemo03.staticFunc1(); //不推荐
        staticFunc2(); // 推荐

        System.out.println("func1");
    }

    public void func2(){
        System.out.println("func2");
    }

    public static void staticFunc1(){
        System.out.println("staticFunc1");
    }

    public static void staticFunc2(){
        System.out.println("staticFunc2");
    }

}
