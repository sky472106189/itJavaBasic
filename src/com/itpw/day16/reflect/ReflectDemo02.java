package com.itpw.day16.reflect;

/*
    通过反射，获取Class，并实例化对象
*/
public class ReflectDemo02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.itpw.day16.reflect.bean.User");
            // newInstance()调用的是无参构造
            Object o = c.newInstance();
            //若类没有无参构造则报错java.lang.InstantiationException
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
