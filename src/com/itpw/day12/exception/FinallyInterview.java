package com.itpw.day12.exception;

/*
* Finally面试题
*   基本数据类型(包装类)finally不会影响数据
*   引用数据类型会被finally影响
* */
public class FinallyInterview {
    public static void main(String[] args) {
        System.out.println(m());// 101?错 是100
        System.out.println(m2());// 王五
        System.out.println(m3());// abc
    }

    public static int m(){
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }

    public static Person m2(){
        Person p1 = new Person("张三");
        try{
            return p1;
        }finally {
            p1.name = "王五";
        }
    }

    public static StringBuffer m3(){
        StringBuffer sb = new StringBuffer("ab");
        try{
            return sb;
        }finally {
            sb.append("c");
        }
    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
