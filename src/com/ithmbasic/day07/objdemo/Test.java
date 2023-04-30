package com.ithmbasic.day07.objdemo;

/*
* 需求：把大象放进冰箱，并关上冰箱
* 用面向对象思维完成
* */
public class Test {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.setName("小飞象");
        elephant.setType("非洲");

        Refrigerator ref = new Refrigerator();
        ref.setId(123123);
        ref.setBrand("海尔");

        ref.openIt();
        ref.putIt(elephant);
        ref.closeIt();
    }
}
