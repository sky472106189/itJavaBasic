package com.itpw.day09.array;

/*
* 数组传参的注意事项
* */
public class ArrayDemo02 {

    public static String name;

    public void doSome(){
        this.name = "123";
        printArray(new int[2]);
    }

    public static void main(String[] args) {
        //没有这种写法
        // printArray({1,2,3});

        // 静态传入实参
        printArray(new int[]{1,2,3});

        // 动态传入实参
        printArray(new int[3]);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
