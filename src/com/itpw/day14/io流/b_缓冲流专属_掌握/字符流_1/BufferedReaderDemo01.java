package com.itpw.day14.io流.b_缓冲流专属_掌握.字符流_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader:
        带有缓冲区的字符输入流，不需要自定义数组进行多字符读取，自带缓冲。
        缓冲流用于提高读写效率

    File开头的类是IO流中最基础的流，其他多数为高级流；
    高级流多数只负责自己的高级功能，不负责基本的读写；
    高级流的使用，多数是要封装一个基本的流对象，从该对象完成基本的读写功能。

    缓冲流只负责缓冲，不负责读写，需要通过传入的基本的字符输入/出流对象完成基本的读写；
    可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。

*/
public class BufferedReaderDemo01 {
    public static void main(String[] args) throws IOException {
        // 只负责缓冲，不负责读写，需要通过传入的基本的字符输入/出流对象完成基本的读写；
        // 可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。

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
