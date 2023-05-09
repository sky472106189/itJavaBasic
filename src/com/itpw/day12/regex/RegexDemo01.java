package com.itpw.day12.regex;

import java.util.Arrays;

// 正则的使用
public class RegexDemo01 {
    public static void main(String[] args) {
        // 校验QQ号，要求全部是数字，长度是（6-20）之间，不能以0开头
        String qq = "0123456789";
        System.out.println(checkQQ(qq));
        System.out.println(checkQQByRegex(qq));
    }

    public static boolean checkQQ(String qq) {
        if (qq == null) {
            return false;
        }
        if ((qq.length() < 6 || qq.length() > 20)) {
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean checkQQByRegex(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }
}
