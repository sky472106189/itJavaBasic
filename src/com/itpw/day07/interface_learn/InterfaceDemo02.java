package com.itpw.day07.interface_learn;

/*
    接口在开发中的作用
*/
public class InterfaceDemo02 {
    public static void main(String[] args) {
        // 多态实例化
        LearnInterface learnInterface = new LearnInterfaceImpl();
        learnInterface.sub(1,2);// 面向接口编程
    }
}

// 接口
interface LearnInterface{
    double PI = 3.14;
    int sum(int a,int b);
    int sub(int a,int b);
}

// implements实现，必须实现接口类中的所有方法
class LearnInterfaceImpl implements LearnInterface{

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }
}