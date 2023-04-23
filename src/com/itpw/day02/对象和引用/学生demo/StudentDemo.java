package com.itpw.day02.对象和引用.学生demo;

/*
* 局部变量存在栈帧中
* 实例变量(成员变量)存在堆内存中
*
*   栈：方法执行就会压栈（局部变量）
*   堆：new出来的对象都在堆中，GC垃圾回收主要针对此（实例对象）
*   方法区：类的信息，字节码信息，代码片段（静态变量）
*   方法的代码片段存放在方法区，但是方法执行过程中需要的内存在堆中
* */


public class StudentDemo {
    public static void main(String[] args) {

        // 局部变量
        int i = 10;

        Student s1 = new Student();
        Student s2 = new Student();

        //实例变量(成员变量)
        s1.no = 100;
        s2.name = "zs";
    }

    public static void func(){
        // 编译不通过，因为s1是局部变量,func函数访问不到main中的局部变量
        //System.out.println(s1);
    }
}
