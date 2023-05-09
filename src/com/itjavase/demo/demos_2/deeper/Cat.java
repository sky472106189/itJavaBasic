package com.itjavase.demo.demos_2.deeper;

import com.itjavase.demo.demos_2.Animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    // protected表示只能子类访问，或同一包下能访问
    @Override
    protected String getBarkSound() {
        return "喵~";
    }
}
