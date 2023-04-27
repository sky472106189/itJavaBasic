package com.itpw.day06.superlearn;

/*
* 分析C1的执行结果，并理解原因
* */
public class SuperDemo02 {
    public static void main(String[] args) {
        new C1();
    }
}

class A1{
    public A1(){
        System.out.println("A1的无参构造");
        /*
        输出如下:
        A1的无参构造
        B1的有参构造（String)
        C1的有参构造（String,int)
        C1的有参构造（String）
        C1的无参构造
        */
    }
}

class B1 extends A1{
    public B1() {
        System.out.println("B1的无参构造");
    }
    public B1(String name){
        System.out.println("B1的有参构造（String)");
    }
}

class C1 extends B1{
    public C1() {
        this("zhangsan");
        System.out.println("C1的无参构造");
    }

    public C1(String name) {
        this(name,20);
        System.out.println("C1的有参构造（String）");
    }

    public C1(String name,int age){
        super(name);
        System.out.println("C1的有参构造（String,int)");
    }
}
