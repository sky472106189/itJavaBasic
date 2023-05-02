package com.itpw.day10.stringbuffer;

/*
* 思考：实际开发中，如果进行字符串的频繁拼接，会有什么问题?
*       因为java中的字符串是不可变的，每一次拼接都会产生新字符串。
*       这样会占用大量的堆内存。
*           String s = "abc";
*           s+"hello";
*       以上两行代码就导致堆内存字符串常量池中创建了3个对象，分别是"abc","hello","abchello"
* */
public class StringBufferDemo01 {
    public static void main(String[] args) {
        String s = "";
        // 这样会给堆内存中的字符串常量池很大的压力
        for (int i = 0; i < 100; i++) {
            s+=i;
            System.out.println(s);
        }
        // 2023.5.1待解决：无限循环去给字符串s添加，并没有OOM
        // 但是用StringBuffer无限循环去添加，反而会OOM
        while(true){
            s+=1;
        }
    }
}
