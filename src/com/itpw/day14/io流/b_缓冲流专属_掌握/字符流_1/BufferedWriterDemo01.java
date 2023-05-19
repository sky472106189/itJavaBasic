package com.itpw.day14.io流.b_缓冲流专属_掌握.字符流_1;

import java.io.*;

/*
    BufferedWriter:
        带有缓冲的字符输出流
*/
public class BufferedWriterDemo01 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/com/itpw/day14/io流/resource/myfile2"));
        // 转换流方式
        BufferedWriter bw2 = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src/com/itpw/day14/io流/resource/myfile2")));

        bw.write("hello world");
        // 换行的操作
        // bw.write("\n"); // 有缺陷
        bw.newLine(); // 根据不同的操作系统，自动选择对应的回车换行符写入文件
        bw.write("hello kitty");

        // 输出流记得刷新
        bw.flush();
        // 关闭包装流
        bw.close();
    }
}
