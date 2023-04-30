package com.ithmbasic.day04;

import java.util.Random;

public class HomeworkDemo {
    public static void main(String[] args) {
        //需求1:静态初始化数组，转存到一个字符串数组中
        int[] array = {1, 2, 3, 4, 5, 6, 1};
        String[] strArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            strArray[i] = "" + array[i];
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.print("\t"+strArray[i]);
        }

        //需求2:随机生成10个数,5~120，存到一个数组当中，求最小值
        int[] tenNum = new int[10];
        Random rd = new Random();
        for (int i = 0; i < tenNum.length; i++) {
            tenNum[i] = rd.nextInt(116) + 5;
        }
        int min = tenNum[0];
        for (int i = 0; i < tenNum.length; i++) {
            if(min>tenNum[i]){
                min = tenNum[i];
            }
        }
        System.out.println("最小值"+min);
    }
}
