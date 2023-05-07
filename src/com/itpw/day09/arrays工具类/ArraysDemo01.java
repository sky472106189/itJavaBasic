package com.itpw.day09.arrays工具类;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/*
 * Arrays是java.util.Arrays包下。是操作数组的工具类。
 * */
public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 2, 4, 0, 1, 2, 4};

        // 1、toString(类型[] arr)数组转为字符串
        System.out.println(Arrays.toString(array));

        // 2、copyOfRange(类型[] arr,起始下标,长度)
        int[] x = Arrays.copyOfRange(array, 0, 3);
        System.out.println(Arrays.toString(x));
        // 输出[I@10f87f48
        // 调用Object的toString()方法
        // 因为数组是引用类型，引用天然继承Object类
        System.out.println(x.toString());

        // 3、copy(类型[] arr,int newLength):拷贝数组，可以指定新数组的长度
        int[] ints = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(ints));

        // 4、setAll(double[] arr,InToDoubleFunction generator)
        double[] doubles = {1.3, 2.2, 3.3, 4.2, 5.0, 6.9};
        // new IntToDoubleFunction()是Java底层提供的函数接口@FunctionalInterface
        Arrays.setAll(doubles, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // 所有元素打折
                return doubles[value] * 0.8;
            };
        });
        System.out.println(Arrays.toString(doubles));

        // 5、sort(类型[] arr):升序排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
