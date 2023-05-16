package com.itjavase.confused.demos_2.deeper;

import com.itjavase.confused.demos_2.Animal;

public class Demo {
    public static void main(String[] args) {
        Animal cat = new Cat("猫");
        System.out.println(cat.bark());
        // 此时无法访问，因为不在同一个包下，无法访问protected
        // String barkSound = cat.getBarkSound();

        // Cat能访问是因为Cat是Animal的子类，所以不论在哪都能访问protected
    }
}
