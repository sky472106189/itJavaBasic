package com.itjavase.confused.demos_2;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public String bark(){
        return "我的名字叫"+name+",我的叫声是"+getBarkSound();
    }

    // protected修饰表名此方法专给子类实现
    protected String getBarkSound(){
        return "";
    }

}
