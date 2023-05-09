package com.itpw.day12.regex;

public class RegexDemo02 {
    public static void main(String[] args) {
        // 1、字符类(只匹配单个字符)
        // [abc]:目标字符，只匹配a,b,c
        System.out.println("a".matches("[abc]"));// true
        System.out.println("ab".matches("[abc]"));// false

        // 2、预定义字符(只匹配单个字符)
        // \在字符串中表示转移 \\才表示\
        System.out.println("3".matches("\\d"));// true
        System.out.println("a".matches("\\d"));// false

        // 3、数量词
        System.out.println("1".matches("[0-9]?"));// true
        System.out.println("123123".matches("[0-9]*"));// true
    }
}
