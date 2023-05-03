package com.itpw.day07.interface_learn.addition;

public class Student {
    private String name;
    private Sex sex;
    private double score;

    public Student() {
    }

    public Student(String name, Sex sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex.getDesc() +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
