package com.itpw.day08.访问控制权限.modify01;

public class F {

    // 私有方法
    private void privateMethod(){}

    // 缺省方法
    void method(){}

    // 受保护方法
    protected void protectedMethod(){}

    // 公开方法
    public void publicMethod(){}

    // 本类中能调用所有权限的方法
    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}

