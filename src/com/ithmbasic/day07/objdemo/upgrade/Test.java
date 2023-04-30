package com.ithmbasic.day07.objdemo.upgrade;

import java.util.ArrayList;
import java.util.List;

/*
* 需求：把大象放进冰箱，并关上冰箱且报告存储物
* 用面向对象思维完成
* */
public class Test {
    public static void main(String[] args) {
        Elephant elep = new Elephant();
        elep.setName("小飞象");
        elep.setType("非洲");
        Bird bird = new Bird();
        bird.setName("海鸥");
        bird.setType("欧洲");
        bird.setSex('m');
        bird.setMarry(false);
        List list = new ArrayList<>();
        list.add(elep);
        list.add(bird);

        Refrigerator ref = new Refrigerator();
        ref.setId(123123);
        ref.setBrand("海尔");

        ref.openIt();
        ref.putIt(list);
        ref.closeIt();
    }
}
