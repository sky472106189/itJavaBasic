package com.itpw.day16.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class ReflectDemo05 {
    public static void main(String[] args) throws Exception {
        // 用相对路径获取绝对路径,疑惑参考 AboutPath.java
        // String path = Thread.currentThread().getContextClassLoader()
        //         .getResource("com/itpw/day16/reflect/resouce/classinfo.properties").getPath();
        // FileReader reader = new FileReader(path);

        // 直接以流的形式返回
        InputStream reader = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("com/itpw/day16/reflect/resouce/classinfo.properties");

        Properties prop = new Properties();
        prop.load(reader);

        String className = prop.getProperty("className");
        Class c = Class.forName(className);
    }
}
