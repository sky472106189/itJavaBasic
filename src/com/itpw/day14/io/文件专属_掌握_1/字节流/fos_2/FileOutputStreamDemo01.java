package com.itpw.day14.io.文件专属_掌握_1.字节流.fos_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件字节输出流
    从内存到硬盘
*/
public class FileOutputStreamDemo01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // new FileOutputStream(String name) 慎用，会把原文件内容清空
            // fos = new FileOutputStream("src/com/itpw/day14/io/resource/myfile");
            // 以追加方式写入文件末尾，不会清空
            fos = new FileOutputStream("src/com/itpw/day14/io/resource/myfile",true);
            //开始写
            String s = "我是中国人";
            byte[] bytes = s.getBytes();
            fos.write(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
