package com.itpw.day12.generic.泛型方法_2.引入自定义泛型.未用泛型_1;

// 未使用泛型时 存在方法重载导致代码冗余
public class GenericDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.show("字符串");
        p.show(123);
        p.show(true);
        p.show(12.3);
    }
}

// 有多个show()的方法重载
class Person {
    public String show(String param) {
        System.out.println(param);
        return param;
    }

    public Integer show(Integer param) {
        System.out.println(param);
        return param;
    }

    public Double show(Double param) {
        System.out.println(param);
        return param;
    }

    public Boolean show(Boolean param) {
        System.out.println(param);
        return param;
    }
}
