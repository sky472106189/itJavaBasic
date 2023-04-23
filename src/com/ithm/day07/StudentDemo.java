package com.ithm.day07;

/*
* 了解面相对象思想
* */
public class StudentDemo {
    public static void main(String[] args) {
        // 1.使用new创建对象
        Student stu = new Student();
        // 2.给对象属性赋值
        // 对象里面的实例变量(成员变量)要用“引用.”访问
        stu.setName("张三");
        stu.setAge(23);
        stu.setSex('男');
        // 3.调用对象方法
        stu.study("高等数学");
        stu.playGame("王者荣耀");
    }
}
