package com.itpw.day07.interface_learn;

/*
    接口和接口之间支持多继承，类和接口支持多实现
    多实现弥补了java中的一个缺陷：
        java中类和类只支持单继承，多实现弥补了这个缺陷。实现了多个接口就类似多继承
*/
public class InterfaceDemo03 {
    public static void main(String[] args) {
        A1 a = new D4();
        B2 b = new D4();
        C3 c = new D4();

        // 以下了解即可
        // 编译报错
        //a.m2();
        // 这样就能调用m2()方法
        // 当时B2和A1没有继承关系，怎么能转型呢？
        // 这是因为接口和接口之间，没有继承关系，也可以强转
        // 但是一定要注意，运行可能会出现ClassCastException异常
        B2 b2 = (B2)a;
        b2.m2();
    }
}

interface A1{
    void m1();
}
interface B2{
    void m2();
}
interface C3{
    void m3();
}
class D4 implements A1,B2,C3{
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {

    }
}
