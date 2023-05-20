package com.itpw.day16.reflect.constructor;

import java.lang.reflect.Constructor;

/*
    通过反射创建对象
*/
public class ConstructorDemo01 {
    public static void main(String[] args) throws Exception {
        Class<?> userClass = Class.forName("com.itpw.day16.reflect.bean.User");
        // 调用无参直接构造（JDK9已过时）
        Object obj = userClass.newInstance();
        // JDK9后的无参方法
        Object o1 = userClass.getDeclaredConstructor().newInstance();

        // 调用有参，获取构造器
        Constructor<?> c1 = userClass.getConstructor(String.class);
        // 再新建
        Object o2 = c1.newInstance("张三");

    }
}
