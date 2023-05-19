package com.itpw.day14.io流.a_文件专属_掌握.字节流.fos_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    文件字节输出流
    从内存到硬盘
*/
public class FileOutputStreamDemo01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // new FileOutputStream(String name) 慎用，会把原文件内容清空
            // fos = new FileOutputStream("src/com/itpw/day14io流resource/myFile");
            // 以追加方式写入文件末尾，不会清空
            fos = new FileOutputStream("src/com/itpw/day14io流resource/myFile",true);
            // 开始写
            String s = "我是中国人";
            byte[] bytes = s.getBytes();
            // 将字符串编码成UTF-8标准的数字
            System.out.println("bytes = " + Arrays.toString(bytes));
            fos.write(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null){
                try {
                    // 如果相对单位读入量很小，
                    // 可以不用flush，因为没什么影响；不过为了保证文件的完整性，推荐flush
                    fos.flush();
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
