package com.ithmbasic.day03;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
//        //输出1~100所有的数
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//        //输出100~1所有的数
//        for (int i = 100; i >= 1; i--) {
//            System.out.println(i);
//        }
        //求出1~100的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
        //求出1~100的偶数和
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);

        //键盘录入一个整数，如果录入的数小于0，输出录入不对
        //否则统计从0到到该录入数的是5的出现次数
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        if(x>=0){
            for (int i = 0; i <= x; i++) {
                if(i%5==0){
                    count++;
                }
            }
            System.out.println(count);
        }else{
            System.out.println("录入不对");
        }
    }
}
