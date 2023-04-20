package com.it.day02;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //键盘录入一个数，是5的倍数就输出
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println(num);
        }

        //输入星期，判断是工作日还是假期日
        System.out.println("请输入星期几");
        int week = sc.nextInt();
        if(week>=1&&week<=5){
            System.out.println("上班时间");
        }else{
            System.out.println("假期日");
        }

        //键盘录入两个整数，判断这个整数和是不是在5~15之间(包含5,15),并且是一个奇数
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int res = a1+a2;
        if(res>=5 && res<=15 && res%2!=0){
            System.out.println("符合");
        }else{
            System.out.println("不符合");
        }
    }
}
