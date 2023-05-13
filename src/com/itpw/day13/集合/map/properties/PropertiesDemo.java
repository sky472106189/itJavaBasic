package com.itpw.day13.集合.map.properties;

import java.util.Properties;

/*
    Properties是一个Map集合,继承自HashTable.
    Properties的key和value都是String类型.
    Properties被称为属性类对象
    Properties是线程安全的.
*/
public class PropertiesDemo {

    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("url","jdbc:mysql://localhost:3306/helloworld");
        p.setProperty("driver","com.mysql.jdbc.Driver");
        p.setProperty("username","root");
        p.setProperty("password","123");

        //通过key获取value
        String url = p.getProperty("url");
        String driver = p.getProperty("driver");
        System.out.println(url);
        System.out.println(driver);
    }

}
