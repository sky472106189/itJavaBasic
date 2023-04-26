package com.ithm.day09;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        // 1.add方法
        studentList.add(new Student(1, "小明"));
        studentList.add(new Student(2, "小刚"));

        // 2.get方法
        System.out.println(studentList.get(0));

        // 3.size()方法
        System.out.println(studentList.size());

        // 4.set()方法 修改
        studentList.set(0, new Student(1, "周杰伦"));

        // 5.遍历
        System.out.println("开始遍历————————————————————");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        Student[] useParam = studentList.toArray(new Student[20]);
        System.out.println(useParam.length);

        // 6. remove方法
        for (int i = studentList.size() - 1; i >= 0; i--) {
            studentList.remove(i);
        }
    }
}

class Student {
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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
}
