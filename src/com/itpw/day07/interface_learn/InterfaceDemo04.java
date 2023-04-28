package com.itpw.day07.interface_learn;

/*
    继承和实现同时存在如何编写代码
*/
public class InterfaceDemo04 {
    public static void main(String[] args) {
        // 不能这样调用，无法使用fly()方法
        // 如果父类和接口类有同名方法，那么可以这样定义
        //Animal tiger = new Tiger();
        Flyable tiger = new Tiger();
    }
}

// 父类
class Animal{
}
// 接口
// 接口通常提取的是行为动作
interface Flyable{
    void fly();
}

// 实现了飞行接口，表示老虎能飞了
class Tiger extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("如虎添翼");
    }
}

//没有实现飞行接口，表示蛇类不能飞
class Snake extends Animal{}
