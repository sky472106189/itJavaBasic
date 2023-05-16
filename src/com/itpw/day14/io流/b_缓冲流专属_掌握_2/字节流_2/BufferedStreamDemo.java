package com.itpw.day14.io流.b_缓冲流专属_掌握_2.字节流_2;

import java.io.*;

/*
    字节缓冲流
        使用字节缓冲流，复制图片文件
*/
public class BufferedStreamDemo {
    public static void main(String[] args) {
        // BufferedInputStream(InputStream in)   基于基础的字节输入流，创建一个缓冲字节输入流对象，使用默认缓冲区大小：8kb
        // BufferedOutputStream(OutputStream out)   基于基础的字节输出流，创建一个缓冲字节输出流对象，使用默认缓冲区大小：8kb
        // int read(byte b[])   每次读取一个字节数组，返回成功读取的个数；读取到文件末尾时返回-1
        // void write(byte b[], int off, int len)  每次写一个字节数组的一部分
        try(BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream("src\\com\\itpw\\day14\\io流\\什么是IO.jpg"));
            BufferedOutputStream bos =
                    new BufferedOutputStream(
                            new FileOutputStream("src\\com\\itpw\\day14\\io流\\什么是IO_1.jpg"));
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                // 边读边写
                bos.write(bytes,0,len);
            }
            // 刷新
            bos.flush();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
