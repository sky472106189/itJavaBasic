package com.itpw.day01.自动类型转换;

/*
* Java中,任何情况下,整数型的"字面量"默认被当做int类型处理
* */
public class IntDemo01 {
    public static void main(String[] args) {
        // 存在自动类型转换 100的字面量会被当成int
        // 然后转换为long类型
        long b = 100;

        // 不存在自动类型转换 100L的字面量就是long
        long c = 100L;

        // 编译报错
        // 这是因为整数字面量当成int，且字面量超过了int的最大值
        //long d = 2147483648; // 2147483647是int最大值

    }
}
