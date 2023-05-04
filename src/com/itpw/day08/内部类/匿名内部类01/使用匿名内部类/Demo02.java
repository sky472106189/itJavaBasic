package com.itpw.day08.内部类.匿名内部类01.使用匿名内部类;

/*
* 匿名内部类
*   学这个是为了看懂别人的代码。并不代表以后要用。
*   在枚举类中可以使用匿名内部类，当枚举实现接口时，可以让不同的枚举用不同的方法体实现同一个接口
*   参考day11.enum_learn.EnumDemo04.java
* */
public class Demo02 {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();
        // mysum方法的第一个参数就是匿名内部类
        // 并不是new接口，接口是不能new的，实际上是表示对接口的实现
        mathUtil.mysum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        },1,2);
    }
}

interface Compute{
    int sum(int a,int b);
}

class MathUtil{
    public void mysum(Compute c, int x, int y){
        int res = c.sum(x,y);
        System.out.println(res);
    }
}