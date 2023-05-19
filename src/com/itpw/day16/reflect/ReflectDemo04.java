package com.itpw.day16.reflect;

/*
    Class.forName()会调用静态代码块,且只执行一次

    重点:
        如果未来只希望静态代码块执行，但是其他代码都不执行，且堆中没有该对象
        可以使用反射Class.forName("完整类名");
*/
public class ReflectDemo04 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.itpw.day16.reflect.MyClass");
            // Object o = c.newInstance();
            // System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    // 静态代码块执行，且只执行一次
    static {
        System.out.println("静态代码块执行");
    }
    {
        System.out.println("实例代码块执行");
    }
}
