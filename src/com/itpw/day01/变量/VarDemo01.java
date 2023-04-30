package com.itpw.day01.变量;

/*
   局部变量：在方法体当中声明的变量
        实例变量:static修饰
        局部变量:无static修饰
   成员变量：在方法体制外，类体内声明的变量

   注意：局部变量只在方法体当中有效，方法体执行结束该变量的内存就释放了
 */
public class VarDemo01 {

    //实例变量
    int i = 100;

    //主方法
    public static void main(String[] args) {
        //局部变量
        int k = 200;    //main方法结束k内存空间释放
    }
}
