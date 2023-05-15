package com.itpw.day14.io流.标准输出流_4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
* PrintStream:
*   标准的字节输出流，默认输出至控制台
* */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello world");
        PrintStream out = System.out;

        out.println("hello");
        out.println("world");

        // 更改输出方向 至指定目录文件 （若没有则新建）
        PrintStream printStream = new PrintStream(new FileOutputStream(
                "C:\\Users\\15173\\Id" +
                        "eaProjects\\itJavaBasic\\src\\com\\itpw\\day14\\io流\\resource\\log1.txt"));
        printStream.println("发现错误 打印报告");
        printStream.println("发现错误 打印报告123");
        // 修改删除方向 setOut()
        System.setOut(printStream);
        // 修改后 系统的输出不会在控制台了，而是在log.txt
        System.out.println("1234455");
    }
}
