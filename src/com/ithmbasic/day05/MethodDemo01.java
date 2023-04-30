package com.ithmbasic.day05;

/**
 * 递归求n的阶乘
 * 底层是类似栈的入栈出栈操作实行。
 * 老师说每一个结果都有一个栈帧存储
 * 每一个方法对应一个栈帧。每一个栈帧有方法运行所需要的内存，以及局部变量
 * 递归貌似消耗栈空间，容易报错StackOverflowError，不到万不得已还是用循环解决
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
