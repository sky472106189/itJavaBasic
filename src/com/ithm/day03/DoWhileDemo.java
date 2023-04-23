package com.ithm.day03;

/**
 * do{
 *     循环体;
 * }while(比较表达式);
 * */
public class DoWhileDemo {
    public static void main(String[] args) {
        //输出1~10的数
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
