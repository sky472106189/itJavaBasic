package com.itpw.day06.finallearn;

/*
    1、final表示最终的，不可变的。
    2、final可以修饰变量，方法，类
        2.1、final修饰的类无法被继承，比如String类
        2.2、final修饰的方法无法被重写
        2.3、final修饰的局部变量，只能赋一次值，不允许更改
*/
public class FinalDemo01 extends B{

    // 编译报错，无法重写final修饰的方法
//    public void doSome(){}

    public static void main(String[] args) {
        // 局部变量
        int i = 100;
        // 可以重新赋值
        i = 200;

        final int k = 100;
        //k = 200; 编译报错
    }
}

//A类无法被继承
final class A{

}

class B{
    // final修饰的方法无法被重写
    final public void doSome(){
        System.out.println("doSOme");
    }
}