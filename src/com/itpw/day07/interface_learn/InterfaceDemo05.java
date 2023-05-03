package com.itpw.day07.interface_learn;

/*
* 一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会有限使用父类的方法
* */
public class InterfaceDemo05 {
    public static void main(String[] args) {}
}

interface A3{
    // 默认方法JDK8新特性 非必须实现
    default void defaultDo(){
        System.out.println("default do some");
    }

    default void defaultDoOther(){
        System.out.println("Do other");
    }
}

class B3{
    void defaultDo(){
        System.out.println("father do some");
    }
}

class C0 extends B3 implements A3{
    // 继承和实现同时出现，必须实现父类和接口同名的默认方法
    @Override
    public void defaultDo() {
        System.out.println("重写执行");
    }
}
