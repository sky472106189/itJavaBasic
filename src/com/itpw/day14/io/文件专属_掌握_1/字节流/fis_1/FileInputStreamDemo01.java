package com.itpw.day14.io.文件专属_掌握_1.字节流.fis_1;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.FileInputStream
        0、以内存为基准，把磁盘中的文件的数据以字节方式读入内存
        1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
        2、字节的方式，完成输入的操作，完成读的操作。(硬盘->内存)

    此读取方式有一个缺点：
        一次读取一个字节Byte(byte),这样内存和硬盘交互太频繁。
*/
public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        // 1.创建文件字节输入流
        FileInputStream fis = null;
        try {
            // \表示转义字符  \\ 表示\  也可以用/来表示文件路径
            fis = new FileInputStream("C:\\Users\\15173\\IdeaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io\\resource\\temp.txt");

            //2.开始读 read方法返回-1即文件末尾
            int readData = 0;
            while((readData=fis.read())!=-1){
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // 多catch语句是细粒度方式
            e.printStackTrace();
        } finally {
            // 在finally中确保流一定关闭
            if (fis != null) {
                // 流是null没必要关闭，避免了NOP
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
