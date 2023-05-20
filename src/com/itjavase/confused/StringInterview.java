package com.itjavase.confused;

/*
在JDK1.6及之前,字符串常量池存放在方法区中。到JDK1.7之后,就从方法区中移除了,而存放在堆中
*/
public class StringInterview {
    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = str1 + "ing";
        String str6 = "string";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//false
        System.out.println(str3 == str6);//true
        System.out.println(str4 == str5);//false
        System.out.println(str4 == str6);//false

    }
}
