package com.itpw.day11.interger;

/*
    JDK1.5之后，支持自动装箱和自动拆箱了
    底部注释有一个面试常温的问题:对-128~127的装箱问题
*/
public class IntegerDemo03 {
    public static void main(String[] args) {
        // 自动装箱 等价于Integer i = new Integer(100);
        Integer i = 100;

        // 自动拆箱 等价于i.intValue()
        int y =  i;

        // 以下代码没有报错，正是得益于自动拆箱，会把z自动转换为基本类型int
        Integer x = 1;
        System.out.println(x+1);

        /*
        * 对-128到127的Integer对象统一放在堆内存的整数型常量池中，当创建新的Integer对象时，如果
        * 符合这个这个范围，并且已有存在的相同值的对象，则返回这个对象(地址)，不需要再创建
        * 一个新的Integer对象，否则创建新的Integer对象
        * */
        Integer a = 99;
        Integer b = 99;
        Integer a1 = 1000;
        Integer b1 = 1000;

        // true,因为a和b的值在-128~127 也就是1B范围内
        System.out.println(a==b);
        // false,因为a1和b1超过了Integer缓存范围，会new两个对象
        System.out.println(a1==b1);

        /*
        * 以上内容可以参考Integer源码
        * Integer类中有一个静态内部类
        *   private static class IntegerCache {
        *     ...
        *   }
        * 里面完成了对-128~127的缓存
        * 更多内容可以百度“IntegerCache”以及静态内部类的加载时机
        * */
    }
}
