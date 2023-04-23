package com.itpw.day02.对象和引用.复杂引用分析;

public class T {

    // o1是T的实例变量
    // 感到困惑就看class A中的B,也是一个实例对象
    A o1;

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        T t = new T();

        //没有这部分代码会报空指针异常
        t.o1 = a;
        a.o2 = b;
        b.o3 = c;
        c.o4 = d;

        //通过t来访问d中的i
        System.out.println(t.o1.o2.o3.o4.i);// 输出0;
    }
}

class A{
    B o2;
}

class B{
    C o3;
}

class C {
    D o4;
}

class D{
    int i;
}