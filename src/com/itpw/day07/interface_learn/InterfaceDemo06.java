package com.itpw.day07.interface_learn;

/*
* (可做了解，实际开发很少用)JDK8和9之后的新特性以及一些疑惑
* */
public class InterfaceDemo06 {
    public static void main(String[] args) {
    }
}

/*
* 实现两个接口，两个接口中的方法完全相同，那么必须要实现接口中同名的默认方法，否则编译不通过
* */
class JdkImpl implements Jdk8and9NewFeature1,Jdk8and9NewFeature2{

    //IDEA按CTRL+I,会要求实现默认方法,但是可以不重写，除非两个接口中有重名的默认方法

    // 必须重写两个接口中同名的默认方法test1()
    @Override
    public void test1() {
        Jdk8and9NewFeature1.super.test1();
    }

    public void func() {
        // 调用接口类的静态方法使用【类名.】
        Jdk8and9NewFeature1.test3();
        // (不同点)调用接口类的默认方法需要【接口名.super.方法名】，了解就好
        Jdk8and9NewFeature1.super.test1();;
    }

    // 编译报错
    // 多个接口中有方法同名但返回值不同的方法时，不论如何都是不能实现的
//    @Override
//    public String strTest1() {
//        return Jdk8and9NewFeature1.super.strTest1();
//    }

    @Override
    public void test4() {
        System.out.println("test4()");
    }
}

interface Jdk8and9NewFeature1{

    // 默认方法(JDK8)
    default void test1(){
        System.out.println("默认方法");
    }

    // 私有方法(JDK9才有)
    // private void test2(){
    //     System.out.println("私有方法");
    // }

    //静态方法(JDK8)
    static void test3(){
        System.out.println("静态方法");
    }

    // 抽象方法(不允许有方法体)
    void test4();

    // 同名但返回值不同的默认方法
//    String strTest1();
}

interface Jdk8and9NewFeature2{
    // 默认方法(JDK8)
    default void test1(){
        System.out.println("默认方法2");
    }

    // 私有方法(JDK9才有)
    // private void test2(){
    //     System.out.println("私有方法2");
    // }

    //静态方法(JDK8)
    static void test3(){
        System.out.println("静态方法2");
    }

    void test4();

    // 同名但返回值不同的默认方法
//     int strTest1();
}
