package com.ithm.day08;

import java.util.Scanner;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 方法一:通过自带reverse()方法实现
        // 注意StringBuilder并没有重写equals方法 如果直接调用equals那么一直返回true
        // 这是因为StringBuilder继承自Object的equals方法,比较的是引用中的地址值
        // 由于是同一个StringBuilder所以一直相同
        // 要想完成判断，需要转换成String的equals方法
        StringBuilder sb = new StringBuilder(str);
        if (sb.toString().equals(sb.reverse().toString())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        // 方法二:通过String数组实现
        char[] chars = str.toCharArray();
        for(int i = 0;i<chars.length/2;i++){
            if(chars[i] != chars[chars.length-1-i]){
                System.out.println(false);
                break;
            }
        }
    }
}
