package com.itpw.day12.generic.泛型方法_2.引入自定义泛型.使用泛型方法_3;

// 使用泛型方法
// 可以用静态修饰，对象也不用创建了
public class GenericDemo {
    public static void main(String[] args) {
        Person.show("String");
        Person.show(123);
        Person.show(true);
        Person.show(3.15);
    }
}

class Person{
    // 泛型方法语法：
    //  修饰符<T,E...> 返回值类型 方法名 (形参){ ... }
    /***
     * public 修饰符
     * <T> 该方法使用泛型T
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T show(T t){
        System.out.println(t);
        return t;
    }
}
