package com.itpw.day12.generic;

/*
* 泛型方法
* */
public class GenericDemo02 {

    public static void main(String[] args) {
        // test1(T t)方法既能传入Object又能传入基本类型int
        // 先不考虑自动装箱
        test1(new Object());
        test1(123);
    }

    // 泛型方法:返回值前加<占位符>
    // 作用:参数和返回值的类型都可以是占位符
    // 优点:泛型方法的参数和返回值类型比普通方法更灵活
    public static <T> void test1(T t){
        System.out.println(t);
    }

    public static <T> T test2(T t){
        return t;
    }

}
