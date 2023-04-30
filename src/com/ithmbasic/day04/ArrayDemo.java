package com.ithmbasic.day04;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //1.数组声明方法
        int[] ageArray;                 //推荐(中括号在类型声明后)
        int[] moneyArray = new int[20]; //推荐
        String nameArray[];             //不推荐(中括号在变量名后)
        int numArray[] = new int[20];   //不推荐
        //2.初始化,并遍历输出
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
            System.out.print(numArray[i] + "\t");
        }

        //动态初始化的数组,未赋值则有默认值
        //整型                默认值0
        //布尔型              默认值false
        //浮点                默认值0.0
        //char                默认值空格
        //引用类型,如String等  默认值NULL
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr);
        }


/*        //需求1:定义一个数组，从键盘输入存5个明星的名字，并输出
        Scanner sc = new Scanner(System.in);
        String[] startNameArray = new String[5];
        for (int i = 0; i < startNameArray.length; i++) {
            startNameArray[i] = sc.next();
        }
        for (int i = 0; i < startNameArray.length; i++) {
            System.out.print(startNameArray[i]+"\t");
        }*/

        /*
         * 需求2:键盘录入刮刮乐号码
         * 使用随机数,范围1~10,把生成的随机数放入数组
         * 中一个20元,统计一共赢了多少钱
         * */
        Scanner sc2 = new Scanner(System.in);
        int priceNum = sc2.nextInt();    //买的刮刮乐号码
        Random rd = new Random();
        int price = 0;
        int[] pricePool = new int[10];  //刮刮乐奖金池
        for (int i = 0; i < pricePool.length; i++) {
            pricePool[i] = rd.nextInt(10) + 1;
        }
        for (int i = 0; i < pricePool.length; i++) {
            if (pricePool[i] == priceNum) {
                price += 20;
            }
        }
        System.out.println("一共赢了" + price + "元");
    }

}
