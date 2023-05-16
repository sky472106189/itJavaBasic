package com.itpw.day14.io流.a_文件专属_掌握_1.字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
 指定字符集读取，如果指定为ASCII字符集，那么只能读取数字英文和某些特殊字符。
 且用ASCII读入内存，用UTF8读出内存演示乱码
*/
public class FileReaderDemo02 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("README.MD", StandardCharsets.US_ASCII);
            FileWriter fw = new FileWriter("README_ByASCII.MD", StandardCharsets.US_ASCII);
            FileWriter fw1 = new FileWriter("README_ByUTF-8.MD", StandardCharsets.UTF_8);){
            int len;
            while((len = fr.read())!=-1){
                fw.write(len);
                fw1.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
