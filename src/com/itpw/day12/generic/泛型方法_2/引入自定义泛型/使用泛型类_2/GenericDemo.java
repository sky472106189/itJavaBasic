package com.itpw.day12.generic.泛型方法_2.引入自定义泛型.使用泛型类_2;

// 使用泛型类优化
// 问题:仅优化了Person类的方法重载，但是方法的调用变得麻烦了。
// 因为泛型的确定由new出来传入的
public class GenericDemo {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>();
        p1.show("字符串");
        Person<Integer> p2 = new Person<>();
        p2.show(123);
        Person<Boolean> p3 = new Person<>();
        p3.show(true);
        Person<Double> p4 = new Person<>();
        p4.show(1.98);
    }
}

// 泛型类
// 多条方法重载合成了一条 优化了代码冗余
class Person<T> {
    public T show(T t){
        System.out.println(t);
        return t;
    }
}
