package com.itpw.day04;

/*
 * this()语法 作用在于语法复用
 * */
public class ThisDemo02 {
    public static void main(String[] args) {
        Date d1 = new Date();

    }
}

class Date {
    private int year;
    private int month;
    private int day;

    // 需求:无参构造方法构造有初始值要求
    public Date() {
        /*
        year = 1970;
        month = 1;
        day = 1;
        */
        // 通过当前类的无参构造方法去调用另一个有参的构造方法
        this(1970, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
