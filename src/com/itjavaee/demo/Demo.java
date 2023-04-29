package com.itjavaee.demo;

/*
 * 学习十六进制赋值
 * */
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
