package com.itpw.day03.staticmethod;

/*
*   静态代码块
*   static {
*       代码;
*   }
*   类加载时执行,且只执行一次
*   自上向下执行，并且在main方法之前执行
* */

public class StaticMethodDemo02 {
    static {
        System.out.println("A");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
    }

    static {
        System.out.println("B");
    }
}
