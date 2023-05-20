package com.itpw.day16.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
    通过配置文件更灵活的实例化对象
*/
public class ReflectDemo03 {
    public static void main(String[] args) {
        try(
            FileReader fr = new FileReader("src\\com\\itpw\\day16\\reflect\\bean\\classinfo.properties")
        ) {
            Properties prop = new Properties();
            prop.load(fr);
            String className = prop.getProperty("className");
            Class c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
