package com.itpw.day09.arrays工具类;

import java.util.Arrays;

/*
* Arrays.sort()操作自定义对象时的注意事项
*   Comparable接口
* */
public class ArraysDemo02 {
    public static void main(String[] args) {
        DogShit s1 = new DogShit("茶杯犬狗屎",10,37);
        DogShit s2 = new DogShit("金毛狗屎",100,15);
        DogShit s3 = new DogShit("哈士奇狗屎",120,-5);
        DogShit[] shits = new DogShit[]{s1,s2,s3};

        // 方式一 对DogShit实现了Comparable接口(少用)
        // Arrays.sort(shits);
        // System.out.println(Arrays.toString(shits));


        // 方式二 直接使用匿名内部类 Comparator接口(常用)
        // Arrays.sort(shits, new Comparator<DogShit>() {
        //     @Override
        //     public int compare(DogShit o1, DogShit o2) {
        //         // return o1.getWeight() - o2.getWeight(); // 升序
        //         return o2.getWeight() - o1.getWeight();// 降序
        //     }
        // });
        // System.out.println(Arrays.toString(shits));

        Arrays.sort(shits,(o1,o2)->o1.getWeight() - o2.getWeight());
        System.out.println(Arrays.toString(shits));
        Arrays.sort(shits,(o1,o2)->o2.getWeight() - o1.getWeight());
        System.out.println(Arrays.toString(shits));

        /*TODO:Comparable接口 和 Comparator接口的区别是什么?
        * 1.Comparable——able 才能。 可以理解为这个类天生就有了这个功能
        * 2.Comparator——tor(constructor) 建造者，可以理解为在新建的时候，才赋予的能力。
        * */
    }
}

