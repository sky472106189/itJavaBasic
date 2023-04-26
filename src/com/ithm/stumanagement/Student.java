package com.ithm.stumanagement;

/**
 * 学生类
 */
public class Student {
    // 学号
    private String id;
    // 姓名
    private String name;
    // 年龄
    private int age;
    // 生日
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号='" + id + '\'' +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 生日='" + birthday + '\'' +
                '}';
    }
}
