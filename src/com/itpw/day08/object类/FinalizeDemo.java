package com.itpw.day08.object类;

/*
    Object类中的finalize()方法
        1、源码：
            protected void finalize() throws Throwable { }
        2、protected修饰，方法体中没有代码
        3、这个方法不需要程序员手动调用，只能重写调用，JVM的回收机制负责调用这个方法
        4、JDK9中此方法已过时
 */
public class FinalizeDemo {
    public static void main(String[] args) {
        // 无限循环是因为
        // java垃圾回收机制不是轻易启动的
        // 垃圾太少，或者时间没到，种种条件下有可能启动，有可能不启动
        while (true) {
            Person p = new Person();
        }

    }
}

class Person {

    // 业务需求:所有对象在JVM中被释放的时候,记录一下释放时间
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.toString()+"即将销毁"+System.currentTimeMillis());
    }
}
