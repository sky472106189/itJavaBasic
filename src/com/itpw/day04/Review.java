package com.itpw.day04;

/*
* 实例相关都要先创建对象，通过【引用.】来访问
* 静态相关直接通过【类名.】来访问
* */
public class Review {

    // 实例方法
    public void m1(){}

    // 静态方法
    public static void m2(){}

    public void func(){
        m1();
        m2();
    }

    public static void main(String[] args) {
        // m1()无法编译通过 因为静态无法引用非静态
        //m1();
        // 编译通过,因为先new了一个对象，通过对象调用实例方法
        new Review().m1();

        // 编译器会自动识别m2()静态方法，结果是Review.m2O();
        m2();
    }


}
