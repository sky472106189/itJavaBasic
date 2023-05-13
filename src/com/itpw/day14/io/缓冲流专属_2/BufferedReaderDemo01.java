package com.itpw.day14.io.缓冲流专属_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader:
        带有缓冲区的字符输入流，不需要自定义数组进行多字符读取，自带缓冲。
*/
public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        // 当一个流的构造器需要另一个流时，这个传入的流叫：节点流
        // 外部负责包装的流叫:包装流（处理流）
        // FileReader是一个节点流，BufferedReader是一个包装流
        FileReader reader = new FileReader("README.MD");
        BufferedReader br = new BufferedReader(reader);

        // public String readLine()
        // 一次读一行，若返回null说明读至文件末尾
        String s = null;
        while((s = br.readLine())!=null){
            // 不会读取换行符
            System.out.print(s);
        }

        // 只需要关闭包装流，因为节点流会在包装流中被关闭(源码有细节)
        br.close();

    }
}
