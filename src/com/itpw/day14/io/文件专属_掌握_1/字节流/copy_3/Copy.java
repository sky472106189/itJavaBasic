package com.itpw.day14.io.文件专属_掌握_1.字节流.copy_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    使用FIS和FOS完成文件的复制
*/
public class Copy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("README.MD");
            fos = new FileOutputStream("src/com/itpw/day14/io/resource/copyFile");
            int readCount = 0;
            byte[] b = new byte[10];
            // 边读边写
            while((readCount = fis.read(b))!=-1){
                fos.write(b,0,readCount);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 分开try 如果一起try，其中一个异常，会影响另一个流的关闭
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
