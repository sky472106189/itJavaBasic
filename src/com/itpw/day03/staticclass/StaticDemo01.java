package com.itpw.day03.staticclass;

/*
*   所有static修饰的，都采用“类名.”的方式访问
*   static修饰的变量:静态变量
*   static修饰的方法:静态方法
*
*   变量的分类：
*       方法体内声明的变量:局部变量
*       方法体外声明的变量:成员变量
*
*       成员变量又分为:
*           - 实例变量(堆中)
*           - 静态变量(方法区)
* */
public class StaticDemo01 {

    // 实例访问时需要“引用.”的方式访问，需要先new对象
    // 实例变量
    int i;
    //实例方法
    public void func2(){}

    // 静态都是类相关的，访问采用“类名.”的方式访问，不需要new对象
    //静态变量
    static int k;
    //静态方法
    public static void func1(){}

}
