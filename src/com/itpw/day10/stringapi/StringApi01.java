package com.itpw.day10.stringapi;

/**
 * 关于String类中的构造方法
 */
public class StringApi01 {
    public static void main(String[] args) {
        // 1、最常用方式
        String s1 = "hello";

        // 2、String(byte[] bytes)
        // 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
        byte[] bytes = {97, 98, 99}; // 97是a 98是b 99是c
        String s2 = new String(bytes);
        System.out.println(bytes[0]);// 97
        System.out.println(s2); // abc

        //String(字节数组，数组元素下标起始处，长度)
        String s3 = new String(bytes, 1, 2);
        System.out.println(s3);// bc

        //将char数组全部转换成字符串
        char[] chars = {'我', '是', '中', '国', '人'};
        String s4 = new String(chars);
        System.out.println(s4); // 我是中国人
        //将char数组部分转换成字符串
        String s5 = new String(chars, 2, 3);
        System.out.println(s5);// 中国人
    }
}
