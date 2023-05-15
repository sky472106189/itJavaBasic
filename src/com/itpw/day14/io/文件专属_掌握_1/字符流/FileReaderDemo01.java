package com.itpw.day14.io.文件专属_掌握_1.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    FileReader:
        文件字符输入流，只能读取普通文本(文本不仅限于txt后缀)
 */
public class FileReaderDemo01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("README.MD");
            char[] chars = new char[5];// 一次读取5个字符
            int readCount = 0;
            while((readCount = fr.read(chars))!=-1){
                System.out.println(chars);
                // String str = new String(chars,0,readCount);
                // System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
