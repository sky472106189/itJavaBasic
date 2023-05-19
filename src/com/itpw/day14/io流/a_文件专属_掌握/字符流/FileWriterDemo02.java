package com.itpw.day14.io流.a_文件专属_掌握.字符流;

import java.io.FileWriter;
import java.io.IOException;

/*
  释放资源
- Java程序操作文件时会独占关联的文件，每次使用完流必须要释放资源。否则其他程序将不能正确访问该文件。
- 调用write方法后，流中数据并没有真的写入文件，需要调用flush()方法，数据才会真的写入文件；
 */
public class FileWriterDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\com\\itpw\\day14\\io流\\io笔记123.txt");

        // 2. 写数据
        fw.write("杭州黑马\r\n");
        fw.write("我爱你\r\n");
        if (true) {
            while (true){}
        }

        // 3. 释放资源
        fw.close();
    }
}
