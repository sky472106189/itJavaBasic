package com.itpw.day03;

public class PrintlnAnalyz {

    static OutImitate OutImitate = new OutImitate();

    public static void main(String[] args) {
        // System.out中 out后面没有小括号,说明out是变量名
        // System是一个类名，使用System.out 说明out是静态变量 因为使用【类名.】方式
        // System.out 返回了一个对象，然后采用【对象.】的方式访问println()方法
        // IDEA中
        System.out.println("Hello World");

        // 仿写
        PrintlnAnalyz.OutImitate.printlnImitate();
    }
}

class OutImitate{

    // 实例方法 需要new对象才能用
    public void printlnImitate(){
        System.out.println("模仿System.out.println()");
    }
}
