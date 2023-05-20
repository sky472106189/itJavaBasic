package com.itpw.day16.reflect;

import java.util.ResourceBundle;

/*
    java.util包下提供了一个资源绑定器,便于获取属性配置文件中的
    注意，属性配置文件后缀以.properties结尾，并且放在类路径下
*/
public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("com\\itpw\\day16\\reflect\\resouce\\classinfo");
        System.out.println(bundle.getString("className"));
    }
}
