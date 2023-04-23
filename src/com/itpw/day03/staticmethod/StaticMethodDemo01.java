package com.itpw.day03.staticmethod;

public class StaticMethodDemo01 {
    public static void main(String[] args) {
        // 静态方法的访问
        StaticMethodDemo01.staticFunc();

        // 实例方法的访问
        StaticMethodDemo01 demo = new StaticMethodDemo01();
        demo.func();
    }

    // 静态方法 不需要new对象 直接“类名.”来访问
    // 可以使用“引用.”但不推荐
    public static void staticFunc(){
        System.out.println("静态方法");
    }

    // 实例方法 使用前需要先new对象 通过“引用.”来访问
    public void func(){
        System.out.println("实例方法");
    }
}
