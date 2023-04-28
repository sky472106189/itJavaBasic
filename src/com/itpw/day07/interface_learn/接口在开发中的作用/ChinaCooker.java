package com.itpw.day07.interface_learn.接口在开发中的作用;

public class ChinaCooker implements FoodMenu{
    @Override
    public void shiZiChaoJiDan() {
        System.out.println("来自东方的西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRousi() {
        System.out.println("来自东方的鱼香肉丝");
    }
}
