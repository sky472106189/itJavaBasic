package com.itpw.day03;

/*
* 模仿System.out.println();
* */
public class PrintlnAnalyz {

    static OutImitate OutImitate = new OutImitate();

    public static void main(String[] args) {
        // System.out中 out后面没有小括号,说明out是变量名
        // System是一个类名，使用System.out 说明out是静态变量 因为使用【类名.】方式
        // System.out 返回了一个引用对象，然后采用【引用.】的方式访问println()方法
        System.out.println("Hello World");

        // 仿写，注意PrintlnAnalyz.OutImitate返回的是一个引用对象
        // 相当于是new 了一个OutImitate对象 通过【引用.】的方式调用
        PrintlnAnalyz.OutImitate.printlnImitate();

        // 静态方法采用【类名.】的方式访问
        com.itpw.day03.OutImitate.printlnImitateStatic();

    }
}

class OutImitate{

    // 实例方法 需要new对象才能用
    // 可以加static修饰 但是不符合规范 因为调用此方法要通过【引用.】的方式来的
    public void printlnImitate(){
        System.out.println("模仿System.out.println()");
    }

    // 用static修饰则按照规范采用【类名.】的方式调用
    public static void printlnImitateStatic(){
        System.out.println("模仿System.out.println()");
    }

}
