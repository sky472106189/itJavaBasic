package com.itjavase.confused.staticdemo;

/*
 * 静态代码块对静态变量的访问有顺序要求吗？
 *  对于静态方法没有顺序，对于静态变量有从上往下的顺序。
 * */
public class Demo03 {

    static int i;

    public static void func1() {
        System.out.println("执行func1");;
    }

    // 静态代码块
    static {
        i++;
        func2();
        // j在静态代码块之后，那么此时不能对j进行操作，只能对j进行赋值
        j = 10;
        //j++;// 编译报错
    }

    static int j=1;

    private static void func2() {
        System.out.println("执行func2");
    }

    public static void main(String[] args) {
        System.out.println("i="+i);
        // j = 1;静态代码块对令j=10,但是被后面的static int j = 1覆盖了
        System.out.println("j="+j);
    }
}
