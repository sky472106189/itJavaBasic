package com.itpw.day08.访问控制权限.modify02;

import com.itpw.day08.访问控制权限.modify01.F;

public class Z extends F {
    void func(){
        // protected 任意包下的子类都能拿到
        protectedMethod();
        publicMethod();
        // 子类和父类不在同一个包下，无法访问缺省方法
        //method();
//        privateMethod();
    }
}
