package com.ithmbasic.day04;

/**
 * 静态初始化数组
 */
public class StaticArrayDemo {
    public static void main(String[] args) {
        //写死数组内容,适用于数组大小内容不变的场景
        int[] array = {1, 2, 3, 4, 5};

        /*
         * 需求1:静态初始化数组：1,2,3,4,5,6,7,8
         *       计算该数组元素的和以及平均数
         * */
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("和是" + sum + ",平均数是" + (sum / (double)a.length));

    }
}
