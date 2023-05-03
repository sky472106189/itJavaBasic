package com.itpw.day05.多态.demos01;

public class Student extends People{
    public int id;

    @Override
    public void doSome() {
        System.out.println("学生");
    }

    /*    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }*/
}

