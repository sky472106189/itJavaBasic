package com.ithm.day03;

import java.util.Scanner;

/**
 * 需求:
 * 键盘录入一个整数，如果录入的数小于0，提示录入的不对，重新录入，一直录入到对为止
 * 计算[1- 该录入数]的和并输出
 * */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x < 0){
            System.out.println("录入不对，重新录入");
            x = sc.nextInt();
        }
        int sum = 0;
        for(int i = 1;i <= x;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
