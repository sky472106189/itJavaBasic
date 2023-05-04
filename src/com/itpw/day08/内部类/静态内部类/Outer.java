package com.itpw.day08.内部类.静态内部类;

public class Outer {
    public int age = 100;
    public static String name = "外部";

    // 静态内部类
    public static class Inner{
        public void test(){
            // 静态内部类不能访问外部类的实例变量
//            System.out.println(age);
            System.out.println(name);
            name = "内部";
            System.out.println(name);
        }
    }
}
