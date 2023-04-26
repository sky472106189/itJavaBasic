package com.ithm.day07;


// 学生类
public class Student {
    private String name;
    private int age;
    private char sex;

    public Student() {
    }
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /***
     * 学习
     * @param course 课程名
     */
    // 成员方法不加static
    public void study(String course){
        System.out.println("学习"+course);
    }

    /***
     * 玩游戏
     * @param gameName 游戏名
     */
    public void playGame(String gameName){
        System.out.println("玩"+gameName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
