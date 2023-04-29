package com.itpw.day01.method;

/*
* 方法重载
*   同一个类名下,方法名相同,形参不同(个数，类型,顺序)，返回值可以相同，更易于以后的代码编写
* */
public class MethodDemo03 {
    public static void main(String[] args) {
        int x = sum(1,2);
        long y = sum(1L,2L);
        double z = sum(1.0,2.0);
        // 返回值相同的重载
        int x1 = sum(1,2L);
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static long sum(long a,long b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,long b){return a+(int)b;}
}
