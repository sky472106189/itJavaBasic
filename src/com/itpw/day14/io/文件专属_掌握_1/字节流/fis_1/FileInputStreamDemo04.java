package com.itpw.day14.io.文件专属_掌握_1.字节流.fis_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    FileInputStream其他常用方法
        1.public int available()  返回流当前剩余的没有读到的字节数量
        2.public long skip(long n)  跳过几个字节不读
*/
public class FileInputStreamDemo04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/com/itpw/day14/io/resource/temp.txt/");

            // available() 剩余多少字节数量
            // int available = fis.available();
            // byte[] b = new byte[available];// 长度为流中的总长度
            // int readCount = fis.read(b);
            // System.out.println(new String(b, 0, readCount));

            // skip(long n)
            fis.skip(3);
            System.out.println(fis.read());


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
