package com.itpw.day14.io.文件专属_掌握_1.字节流.fis_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
    一次最多读取b.length个字节。
    减少硬盘和内存的交互，提高效率
*/
public class FileInputStreamDemo02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 使用相对路径
            // IDEA默认当前路径在工程的根目录 有疑惑可以看README.MD在哪
            // fis = new FileInputStream("README.MD");
            fis = new FileInputStream("src/com/itpw/day14/io/resource/temp.txt/");

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
            System.out.println(new String(b));// efcd
            System.out.println(new String(b,0,readCount));// ef

            readCount = fis.read(b);
            System.out.println(readCount);// -1 :一个字符也没有读到

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
