package com.itpw.day01.method;

public class MethodDemo02 {
    /*
    输出结果:
        main开始，func1开始执行，func2开始执行，func2执行结束，func1执行结束，main结束。

    分析:
        JVM中有栈，堆内存，方法区
        其中main先压到栈低,然后执行func1,即压func1入栈,接着压func2入栈。接着弹栈并输出
        方法区中存放代码片段

        每一个方法对应一个栈帧。
        每一个栈帧有方法运行所需要的内存，以及局部变量
    */
    public static void main(String[] args) {
        System.out.print("main开始，");
        MethodDemo02.func1();
        System.out.print("main结束。");
    }

    public static void func1(){
        System.out.print("func1开始执行，");
        func2();
        System.out.print("func1执行结束，");
    }

    public static void func2(){
        System.out.print("func2开始执行，");
        System.out.print("func2执行结束，");
    }
}
