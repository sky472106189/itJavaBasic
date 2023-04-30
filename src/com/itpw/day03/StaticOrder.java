package com.itpw.day03;

/*
 * 含有static的代码执行顺序
 * */
public class StaticOrder {

    // 静态变量 存储在方法区
    static int i = 100;

    // 实例变量 new对象才会存在
    int k = 111;

    // 静态代码块 类加载时执行
    static {
        // 能访问静态变量i 不能访问实例变量k
        System.out.println(i);
        // 这样才能访问k
        StaticOrder obj = new StaticOrder();
        System.out.println(obj.k);

        // 无法访问静态变量name 因为静态是自上而下的顺序
        // 注意静态方法不需要顺序，比如可以直接调用main方法
        // 但是静态变量是有顺序的 可以参考com.itjavaee.day01.staticdemo.Demo03
//        System.out.println(name);
//        System.out.println(j);
        main(new String[]{"1","2"});
    }

    int m;

    static int j;

    static String name = "ABC";

    public static void main(String[] args) {
        System.out.println("main begin");
    }
}
