package com.itpw.day14.io流.a_文件专属_掌握.字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("src/com/itpw/day14/io/文件专属_1/字节流/copy_3/Copy.java");
            fw = new FileWriter("src/com/itpw/day14/io/resource/myfile1.txt");

            char[] chars = new char[100];
            int readCount = 0;
            while ((readCount = fr.read(chars)) != -1) {
                // fw.write(chars);// 直接写会有错误，既abcd->efcd的错误
                fw.write(chars,0,readCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
