package com.itpw.day10.string;

public class StringDemo01 {
    public static void main(String[] args) {
        // 下面两行代码表示底层创建了3个字符串对象，分别是"abc","xy","abcxy"
        String s1 = "abc";
        String s2 = "abc"+"xy";

        // 只要有一个变量参与赋值,结果就在堆中
        // 变量拼接的底层原理其实是new StringBuilder进行拼接。
        String s3 = s1+"xy";

        // new对象一定会在堆内存开辟空间
        String s4 = new String("abcxy");

    }
}
