package com.itpw.day10.string;

/*
* 报错OutOfMemoryError: Java heap space
*   进一步证明字符串常量池在堆中
* */
public class StringDemo03 {
    public static void main(String[] args) {
        String str = new String("Hello World!");
        while(true){
            str = new String(new byte[1207959552]);
        }
    }
}
