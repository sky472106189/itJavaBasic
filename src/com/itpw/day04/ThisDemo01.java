package com.itpw.day04;

public class ThisDemo01 {

    String name;

    public void func(){
        System.out.println(this.name);// this可以省略
        //System.out.println(name);// this可以省略,默认有this
    }

    // 编译报错,因为静态方法是采用【类名.】方式访问
    // 而this是代表当前对象,但静态方法不需要对象。矛盾了
    public static void staticFunc(){
        //this.name;
    }
}

class Animal{

    //实例变量 必须先new对象，在堆中开辟空间才能访问，通过【引用.】
    String name = "野兽";

    // 静态方法
    public static void func1(){
        // 编译报错 因为静态方法无法访问未new对象的成员变量
        // 或者:因为name前面省略了this.而this和静态是冲突的
//        System.out.println(name);
    }

    // 实例方法
    public void fun2(){
        System.out.println(this.name);
        System.out.println(name);
    }
}
