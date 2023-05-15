package com.itpw.day14.编码和解码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    关于编码和解码
     byte[] getBytes () 使用平台的默认字符集将一个字符串编码为字节数组
     byte[] getBytes (String charsetName)使用指定的字符集将一个字符串编码为字节数组
     String( byte[] bytes)使用平台的默认字符集解码指定的字节数组来创建字符串
     String( byte[] bytes, String charsetName)通过指定的字符集解码指定的字节数组来创建字符串
*/
public class EncodeDecodeDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1、编码
        String str1 = "中国";
        // 使用默认字符集编码字符串，默认字符集:UTF-8
        byte[] str1Bytes = str1.getBytes();
        // str1Bytes = [-28, -72, -83, -27, -101, -67] :utf-8对中文是三个字节，一共6个刚好两个中字
        System.out.println("str1Bytes = " + Arrays.toString(str1Bytes));
        // 使用指定字符集编码字符串:GBK
        byte[] str1GBK = str1.getBytes("GBK");
        // str1GBK = [-42, -48, -71, -6] :GBK中文对应两个字节，一共4个刚好两个中字
        System.out.println("str1GBK = " + Arrays.toString(str1GBK));

        // 2、解码
        // 使用默认字符集UTF-8，进行解码进字符串
        String newStr1 = new String(new byte[]{-28, -72, -83, -27, -101, -67});
        // newStr1 = 中国
        System.out.println("newStr1 = " + newStr1);
        // 使用指定字符集GBK
        String newString2 = new String(new byte[]{-42, -48, -71, -6}, "GBK");
        // newString2 = 中国
        System.out.println("newString2 = " + newString2);

        // 演示乱码
        // 对UTF编码，使用GBK解码
        String newString3 = new String(new byte[]{-28, -72, -83, -27, -101, -67},"GBK");
        // newString3 = 涓浗
        System.out.println("newString3 = " + newString3);

    }
}
