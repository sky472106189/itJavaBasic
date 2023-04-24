package com.itpw.day05.多态.unit1;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("cat走猫步");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
