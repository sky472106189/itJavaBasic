package com.itpw.day12.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    关于try-catch捕捉到异常后，后续代码执行与否
        try语句块中的某一行出现异常，该行后面的代码不会执行。
*/
public class ExceptionDemo05 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            System.out.println("try begin");
            m1();
            System.out.println("try over");// 不会执行
        } catch (FileNotFoundException e) {
            System.out.println("catch begin");
            e.printStackTrace();
        }
        System.out.println("main over");
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");// 不会执行
    }

    public static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        new FileInputStream("D:\\");
        System.out.println("m2 over");// 不会执行
    }
}


