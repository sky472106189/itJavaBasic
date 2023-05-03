package com.itpw.day08.访问控制权限.modify01;

// 和F同包
public class Demo01 {
    public static void main(String[] args) {
        F f = new F();
        // 无法访问同包下的private方法
        //f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();

    }
}
