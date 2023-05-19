package com.itpw.day13.集合.map.properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
    基于JDK8
    Properties是一个Map集合,继承自HashTable.
    Properties的key和value都是String类型.
    Properties被称为属性类对象
    Properties是线程安全的.
*/
public class PropertiesDemo {

    /*
    Properties特有方法:
    1.Object setProperty(String key, String value) 设置集合的键和值，都是String类型，底层调用Hashtable的put方法
    2.String getProperty(String key) 使用此属性列表中指定的键搜索属性
    3.Set<String> stringPropertyNames() 获取所有key，注意这是不可修改的key集。
    */
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

        System.out.println("——————————————");

        // 获取所有key并放入set
        Set<String> keys = p.stringPropertyNames();
        keys.forEach(s-> System.out.println(s));
        keys.add("123"); // 不可添加不可修改，否则报错java.lang.UnsupportedOperationException

        /*
        * 不可修改原因是来自stringPropertyNames()方法返回的是UnmodifiableSet类型Set
        * 翻译为 不可修改集
        * 此类型的remove和add方法都直接抛异常UnsupportedOperationException
        * */

    }

}
