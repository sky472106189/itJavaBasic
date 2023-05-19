package com.itjavase.confused.extends_learn;

public class Animal {
    private String name;

    public void move(){
        // 为什么对私有对象直接name是可以的？
        // 这是因为private是允许在本类中直接调用的
        System.out.println(name+"在移动");
        System.out.println(getName()+"在移动");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
