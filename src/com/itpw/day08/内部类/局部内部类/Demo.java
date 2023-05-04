package com.itpw.day08.内部类.局部内部类;

/*
* 局部内部类，类似于局部变量。匿名内部类属于局部内部类的一种
*   在类中且方法体之内
* */
public class Demo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.study();
        StaticStudent.study();
    }
}
