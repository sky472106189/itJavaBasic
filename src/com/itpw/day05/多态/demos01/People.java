package com.itpw.day05.多态.demos01;

public class People {
    public String name;
    public int age;
    public int id;

    public void doSome(){
        System.out.println("123");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}