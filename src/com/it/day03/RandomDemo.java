package com.it.day03;

import java.util.Random;

/**
 * Random用法和Scanner类似
 * */
public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = rd.nextInt(10);//取值范围[0,9]
        //int = rd.nextInt(81)+20;//[20,100]
        while(i!=5){
            System.out.println(i);
            i = rd.nextInt(10);
        }

        /*需求：
        * 随机生成20个数，范围[111,333]
        * 统计这20个随机数有多少个奇数，并输出
        * */
        Random rd2 = new Random();
        int x = 0;
        int count = 0;
        for(int j = 0;j<20;j++){
            x = rd2.nextInt(223)+111;
            if(x%2==1){
                count++;
                System.out.println(x);
            }
        }
        System.out.println("奇数有"+count+"个");
    }
}
