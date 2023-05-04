package com.itpw.day12.generic.类型通配符.demo01;

public class Box <E>{
    private E data;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
