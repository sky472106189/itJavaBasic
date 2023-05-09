package com.itpw.day08.访问控制权限.modify02;

// Z是F子类
public class Demo02 {
    public void func1() {
        Z z = new Z();
        // z.privateMethod();
        // z.method();
        //  Demo02不是F类任意包下的子类里，故无法访问
        // z.protectedMethod();
        z.publicMethod();
    }
}
