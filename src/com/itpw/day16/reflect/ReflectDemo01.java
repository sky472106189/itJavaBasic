package com.itpw.day16.reflect;

/*
    获取类的字节码有四种方式
    1、Class.forName("传入类的全路径");
    2、对象.getClass();
    3、对象.class;
    4、通过类加载器xxxClassLoader.loadClass()传入类路径获取:
*/
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 第一种
        Class c1 = Class.forName("java.lang.String");
        // 第二种
        Class c2 = new String("abc").getClass();
        // 第三种
        Class c3 = String.class;
        // 第四种
        Class c4 = ClassLoader.getSystemClassLoader().loadClass("java.lang.String");

        // true 由于.class文件会装载进方法区，且仅一份
        // c1和c2两个引用都指向了方法区中的String.class
        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c3 == c4);


    }
}
