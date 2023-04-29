package com.itpw.day08.内部类.使用匿名内部类;

/*
* 匿名内部类
*   纯粹装逼的，学这个是为了看懂别人的代码。并不代表以后要用。
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