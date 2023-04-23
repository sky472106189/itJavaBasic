package com.itpw.day03.staticclass;

/*
* 实例：一定使用“引用.”访问
* 静态：建议使用“类名.”访问,可以使用“引用.”访问，但是容易让同事产生困惑
* */
public class StaticDemo03 {
    public static void main(String[] args) {
        English e1 = new English(1,"Dave");
        // 可以通过“引用.”方式访问，但是不建议
        System.out.println(e1.country);
        // 推荐
        System.out.println(English.country);

        e1 = null;
        // 不会出现空指针异常
        // 因为静态变量不需要对象的存在
        System.out.println(e1.country);
        // 会出现
        System.out.println(e1.id);

    }
}

class English{
    int id;
    String name;

    //静态变量
    static String country = "英国";

    public English() {
    }

    public English(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
