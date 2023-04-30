package com.ithmbasic.day07.objdemo.upgrade;

/***
 * 鸟类
 */
public class Bird {
    private String name;
    private String type;
    // 性别
    private char sex;
    // 婚否
    private boolean marry;

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sex=" + sex +
                ", marry=" + marry +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }
}
