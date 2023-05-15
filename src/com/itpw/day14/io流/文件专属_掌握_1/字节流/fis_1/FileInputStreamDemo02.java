package com.itpw.day14.io流.文件专属_掌握_1.字节流.fis_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
    int read(byte[] b)
        从文件中读取一个字节数组的内容，并传入形参，返回读取到的字节数，否则为-1
        减少硬盘和内存的交互，提高效率

    byte[] readAllBytes()
        JDK9的新特性：读取文件中所有内容并转换为字节数组返回
*/
public class FileInputStreamDemo02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 使用相对路径
            // IDEA默认当前路径在工程的根目录 有疑惑可以看README.MD在哪
            // fis = new FileInputStream("README.MD");
            fis = new FileInputStream("src/com/itpw/day14/io流/resource/temp.txt/");

            // 采用byte[] b数组读，最多读取b.length个字节
            byte[] b = new byte[4];
            // 注意:read(byte[] b)方法返回的是：读取到的字节数量
            // 会把结果读到byte[]数组中
            int readCount = fis.read(b);
            System.out.println(readCount);// 4
            System.out.println(new String(b));// abcd
            System.out.println(new String(b,0,readCount));// abcd

            readCount = fis.read(b);
            System.out.println(readCount);// 2
            System.out.println(new String(b));// efcd 按道理只应该有ef
            System.out.println(new String(b,0,readCount));// ef

            readCount = fis.read(b);
            System.out.println("读完后byte数组的内容");
            System.out.println(new String(b));
            System.out.println(readCount);// -1 :一个字符也没有读到

            System.out.println("————————————————————————");

            // JDK9新特性: byte[] readAllBytes()
            // 缺点:文件过大，容易报错OOM
            fis = new FileInputStream("src/com/itpw/day14/io流/resource/temp1.txt/");
            byte[] bytes = fis.readAllBytes();
            // 会读取换行
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
