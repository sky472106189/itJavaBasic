package com.ithm.demo;

/**
 * 第六题. 使用Random产生10个随机数[22-888],然后放到一个数组中,
 * 1.打印数组元素
 * 2.将数组中是3的整倍数的元素打印出来
 */
public class Demo {
    public static void main(String[] args) {
        /*
        *       0x80000000 = 1000,0000,0000,0000,0000,0000,0000,0000
        * 符号位为负,转原码 = 1000,0000,0000,0000,0000,0000,0000,0000 = -(2^31)
        *   -2^31 ~2^31-1
        * */
        Integer i =  0x80000000;
        System.out.println(i);
    }
}
