package com.itpw.day14.io流.c_对象专属流_掌握.Serializable作用;

import java.io.Serializable;

public class Student implements Serializable {

    // 序列化版本号
    private static final long serialVersionUID = -4229243958018842187L;

    private int id;
    private String name;
    // private int age;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
