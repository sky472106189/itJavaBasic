package com.itpw.day12.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* try-catch中 catch可以有多个
*   用catch捕捉精确异常，对症下药
*   注意：catch捕捉从上到下有顺序，必须是子类，然后父类的关系。也可以是兄弟顺序
* */
public class ExceptionDemo06 {
    public static void main(String[] args) {
        try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("D:\\");
            // 读文件
            fis.read();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("读文件报错");
        }

        // JDK8 新特性
        try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("D:\\");
            int i = 100/0;
        }catch (FileNotFoundException | ArithmeticException e){
            System.out.println("文件不存在");
            System.out.println("JDK8新特性，允许在Catch中使用 | 符号");
        }
    }
}
