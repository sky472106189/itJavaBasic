package com.itpw.day03.staticclass;

public class StaticDemo02 {
    public static void main(String[] args) {

        //静态变量使用“类名.”访问
        System.out.println(Chinese.country);

        Chinese c1 = new Chinese(1,"张三");
        Chinese c2 = new Chinese(2,"王五");
        System.out.println(c1.id+"  "+c1.name+"  "+c1.country);
    }
}

class Chinese{
    int id;
    String name;
    //静态变量
    // static String country; 不赋值就为初始值 引用类型初始值null
    // 静态变量在类加载时初始化,不需要new对象,静态变量的空间就已经存在了
    // 静态变量存储在【方法区】中
    static String country = "中国";

    public Chinese() {
    }

    public Chinese(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
