package com.ithmbasic.day07;

/*
 	1.定义位置
		成员变量：定义在类中方法外。作用于整个类中
		局部变量：定义在方法内或方法的声明上。作用于方法里

	2.在内存中的位置
		成员变量：在堆内存中
		局部变量：在栈内存中

	3.生命周期
		成员变量：随着对象的创建而创建。随着对象的消失而消失
		局部变量：随着方法的调用而创建。随着方法的消失而消失

	4.初始化值
		成员变量：有默认初始化值
		局部变量：没有默认初始化值。使用之前必须赋值
 */
public class Variable {
    // 成员变量 又叫实例变量
    int k;

    // args就是一个局部变量
    public static void main(String[] args) {
        // 都是局部变量
        int i = 0;
        Variable var = new Variable();
        // System.out.println(k); // 无法访问 因为k是成员变量 需要先new 出一片空间才行
        System.out.println(var.k);
    }

    public void m1(){}
}
