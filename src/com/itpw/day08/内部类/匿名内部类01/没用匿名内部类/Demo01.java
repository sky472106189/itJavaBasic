package com.itpw.day08.内部类.匿名内部类01.没用匿名内部类;

/*
    内部类：
        1、在类的内部又定义了一个新的类，被称为内部类
        2、内部类分类：
            静态内部类：类似于静态变量
            实例内部类：类似于实例变量
            局部内部类：类似于局部变量。匿名内部类属于局部内部类的一种
        3、匿名内部类因为没有名字，所以叫匿名内部类
        4、内部类使可读性很差，实际开发尽量避开

*/
public class Demo01 {
    // 静态内部类
    static class Inner1{
    }

    // 实例内部类
    class Inner2{
    }

    public void doSome(){
        // 局部内部类
        class Inner3{
        }
    }

    public static void main(String[] args) {
        MathUtil math = new MathUtil();
        math.mysum(new ComputeImpl(),1,2);
    }
}

interface Compute{
    int sum(int a,int b);
}

// 没用匿名内部类 这个实现类就不能省
class ComputeImpl implements Compute{
    @Override
    public int sum(int a, int b) {
        return 0;
    }
}
//数学类
class MathUtil{
    public void mysum(Compute c,int x,int y){
        int res = c.sum(x,y);
        System.out.println(res);
    }
}
