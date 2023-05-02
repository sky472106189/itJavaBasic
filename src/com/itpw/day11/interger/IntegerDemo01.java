package com.itpw.day11.interger;

/*
    java中为8种基本数据类型准备了8种包装类型，包装类型属于引用数据类型，父类Object类
*/
public class IntegerDemo01 {
    public static void main(String[] args) {
        // 调用doSome方法但是无法传入基本数据类型
        // 这时就能使用基本数据的包装类
        doSome(new Integer(100));
    }

    public static void doSome(Object obj){
        System.out.println(obj);
    }
}
