package com.itpw.day14.io流.a_文件专属_掌握.字节流.fis_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    文件输入流最终版
*/
public class FileInputStreamDemo03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/com/itpw/day14io流resource/temp.txt/");
            // 准备一个byte数组读取文件
            byte[] b = new byte[4];
            int readCount = 0;
            while((readCount = fis.read(b))!=-1){
                System.out.println(new String(b,0,readCount));
            }
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
