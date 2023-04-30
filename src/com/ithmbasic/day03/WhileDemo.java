package com.ithmbasic.day03;

/**
 * while循环
 * 	一般在循环次数确定的时候，推荐使用for循环
 *  一般在循环次数不确定的时候，推荐使用while循环
 * */
public class WhileDemo {
    public static void main(String[] args) {
        //输出1~10的数
        int i = 1;
        while(i<=10){
            System.out.println(i++);
        }
        /*
         * 世界最高山峰是珠穆朗玛峰8848.86米(8848.86米 等于  8848860毫米)，
         * 假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，
         * 可以超过珠穆朗玛峰的高度?
         * */
        double b = 0.1;
        int count = 0;
        while(b<8848860){
            b*=2;
            count++;
        }
        System.out.println(count);
    }
}
