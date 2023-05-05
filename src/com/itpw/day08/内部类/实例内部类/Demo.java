package com.itpw.day08.内部类.实例内部类;

/*
* 实例内部类。
*   类中，方法之外
*   由于实例内部类属于类本体，所以能直接访问到private修饰的变量
* */
public class Demo {
    public static void main(String[] args) {
        // 了解实例内部类和其特点
//        Car car = new Car();
//        Car.Engine engine = car.new Engine();

        // 1.几乎用不到，源码中会出现
        // 2.先new出外部对象，对象.new.内部类
        Car.Engine engine = new Car().new Engine();
        engine.fire();

        /*
        实例内部类的一个源码应用在ArrayList中迭代器iterator的创造:
            ArrayList中的迭代器iterator 是通过实例内部类的方式构造出来的
            Iterator iterator = new ArrayList().iterator();
        */
    }
}
