package com.itpw.day10.string;

public class StringDemo01 {
    public static void main(String[] args) {
        // 下面两行代码表示底层创建了3个字符串对象，分别是"abc","xy","abcxy"
        String s1 = "abc";
        // 常量折叠现象
        // 常量折叠会把常量表达式的值求出来作为常量嵌在最终生成的代码中
        // Javac 编译器会对源代码做的极少量优化措施之一
        // 并不是所有的常量都会进行折叠，只有编译器在程序编译期就可以确定值的常量才可以
        // 编译器会给你优化成 String s2 = "abcxy"; 。
        String s2 = "abc"+"xy";

        // 只要有一个变量参与赋值,结果就在堆中
        // 引用变量拼接的底层原理其实是new StringBuilder进行拼接。
        String s3 = s1+"xy";

        // new对象一定会在堆内存开辟空间
        String s4 = new String("abcxy");

    }
}
