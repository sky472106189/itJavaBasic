package com.itpw.day01.变量;

/*
    变量的作用域
        总结一句话：出了大括号就不认识了
                    就近原则，哪个离我近，就访问哪个
*/
public class VarDemo02 {
    // 成员变量
    int i = 500;

    public static void main(String[] args) {
        // 局部变量
        int i = 10;
        System.out.println(i);// 10

        for (int n = 0; n < 10; n++) {

        }
        // for循环执行结束之后，在这里访问不到n变量

    }

    public static void func() {
        //i是无法访问的
        //System.out.println(i);

        //定义和main方法同名变量是可以的
        //这是因为两个局部变量所属范围不同
        int i = 200;
    }
}
