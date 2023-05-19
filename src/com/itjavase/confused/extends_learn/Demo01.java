package com.itjavase.confused.extends_learn;

public class Demo01 {
    public static void main(String[] args) {
        Cat cat = new Cat();

//        cat.name = "猫";
//        cat.move();

        cat.setName("猫");
        cat.move();
        System.out.println(cat.name);
    }
}
