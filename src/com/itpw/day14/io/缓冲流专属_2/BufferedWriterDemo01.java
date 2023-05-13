package com.itpw.day14.io.缓冲流专属_2;

import java.io.*;

/*
    BufferedWriter:
        带有缓冲的字符输出流
*/
public class BufferedWriterDemo01 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/com/itpw/day14/io/resource/myfile2"));
        // 转换流方式
        BufferedWriter bw2 = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src/com/itpw/day14/io/resource/myfile2")));

        bw.write("hello world");
        bw.write("\n");
        bw.write("hello kitty");

        // 输出流记得刷新
        bw.flush();
        // 关闭包装流
        bw.close();
    }
}
