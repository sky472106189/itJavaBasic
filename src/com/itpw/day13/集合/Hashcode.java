package com.itpw.day13.集合;

/*
* hashCode()调用哈希函数取得目标值。
*   注意：哈希函数操作不同的值仍有可能取得相同的值 比如s1和s2
* */
public class Hashcode {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("acD");
        String s3 = new String("acd");

        System.out.println(s1.hashCode());// 96354
        System.out.println(s2.hashCode());// 96354
        System.out.println(s3.hashCode());// 96386

    }
}
