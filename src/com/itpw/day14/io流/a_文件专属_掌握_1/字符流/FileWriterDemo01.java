package com.itpw.day14.io流.a_文件专属_掌握_1.字符流;

import java.io.FileWriter;
import java.io.IOException;

/*
    FileWriter:
        文件字符输出流
 */
public class FileWriterDemo01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            // 清空原文件方式
            // fw = new FileWriter("src/com/itpw/day14/io流/resource/myfile1");
            // 追加方式
            fw = new FileWriter("src/com/itpw/day14/io流/resource/myfile1",true);
            char[] chars= {'我','是','中','国','银'};
            fw.write(chars);
            fw.write("\n");
            fw.write("我是java软件工程师");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
