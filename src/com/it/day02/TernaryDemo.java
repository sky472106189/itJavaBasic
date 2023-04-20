package com.it.day02;

/**
 * 三木运算符
 *  布尔表达式?表达式1:表达式2
 *  先判断布尔表达式的结果，如果结果为true三元表达式的结果就是表达式1，否则就是表达式2
 * */
public class TernaryDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a>b?a:b;
        System.out.println(max);
    }

}
