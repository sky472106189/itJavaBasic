package com.ithm.day07.objdemo.upgrade;

/***
 * 大象
 */
public class Elephant {
    // 种类
    private String type;
    // 昵称
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
