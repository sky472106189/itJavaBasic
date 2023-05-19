package com.itpw.day13.集合.map.properties;

import java.io.*;
import java.util.Properties;

/*
    IO和Properties的结合
    1.void load(Reader reader) 从输入字符流读取属性列表
    2.void store(Writer writer,String comments)将此属性列表写入Properties表中,以适合使用oad(Reader)方法的格式写入输出字符流
*/
public class IoProperties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("url","jdbc:mysql://localhost:3306/helloworld");
        p.setProperty("driver","com.mysql.jdbc.Driver");
        p.setProperty("username","root");
        p.setProperty("password","123");

        // 写数据到文件
        p.store(
                new BufferedWriter(
                        new FileWriter("src\\com\\itpw\\day13\\集合\\map\\properties\\prop.properties"))
                ,"comments here");

        // 清空集合
        p.clear();

        // 从文件读到集合
        p.load(
                new BufferedReader(
                        new FileReader("src\\com\\itpw\\day13\\集合\\map\\properties\\prop.properties")));
        System.out.println("p = " + p);
    }
}
