package com.itpw.day10.stringapi;

import java.nio.charset.StandardCharsets;

/**
 * String常用方法
 * */
public class StringApi02 {
    public static void main(String[] args) {
        //1.public char charAt(int index)
        char c = "中国人".charAt(1);
        System.out.println(c);//国

        //2.public byte[] getBytes()
        // 字符串转byte数组
        byte[] bytes = "abc".getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        //3.public int indexOf(String str)
        // 第一次出现的下标
        System.out.println("我是中国人我是外国人".indexOf("外国人"));//7

        //4.public boolean isEmpty()
        //判断是否为空

        //5.public String replace(char oldChar,char newChar)
        // 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。

        //6.public String[] split(String regex)
        // 根据匹配给定的regex正则表达式来拆分此字符串。
        String[] ymd = "1900-12-01".split("-");
        for (String s : ymd) {
            System.out.print(s); //19001201
        }

        //7.public boolean startsWith(String prefix)
        //测试此字符串是否以指定的前缀开始。

        //8.public String substring(int beginIndex)
        //截取字符串
        System.out.println("http://www.badu.com".substring(7));// www.baidu.com

        //9.public String substring(int beginIndex,int endIndex)
        //截取字符串，制定开始和结束位置
        System.out.println("http://www.badu.com".substring(7,10)); //www

        //10.public char[] toCharArray()
        // 字符串转char数组
        char[] chars = "我是中国人".toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar);
        }

        //11.trim() 去掉空格

        //12.public static String valueOf()
        // String类中唯一的静态方法
        // 作用:将非字符串转换成字符串
        String s1 = String.valueOf(true);
        String s2 = String.valueOf(100);
        // valueOf操作引用时，会自动调用该引用中的toString方法
        String s3 = String.valueOf(new Customer());
        System.out.println(s1+" "+s2+" ");// true 100
        System.out.println(s3);// 我是VIP
    }
}

class Customer{

    @Override
    public String toString() {
        return "我是VIP";
    }
}
