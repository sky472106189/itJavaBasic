package com.it.day05;

/**
 * 递归求n的阶乘
 * 底层是类似栈的入栈出栈操作实行。
 * 老师说每一个结果都有一个栈帧存储
 * 疑问:什么是栈帧？是栈帧还是栈针？
 * 疑问：递归貌似更消耗空间，不是很确定，有待查证。
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        System.out.println(func(3));
    }

    /***
     * 求n的阶乘
     * @param n 正整数
     * @return 阶乘
     */
    public static int func(int n){
        if(n==1){
            return n;
        }else{
            return n*func(--n);
        }

    }
}
