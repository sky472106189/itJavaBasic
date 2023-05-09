package com.itpw.day12.generic.泛型类_1;

/*
* 关于泛型类中 数组的知识
* */
public class GenericDemo03<T> {
    private T[] objArr;

    // 参考ArrayList源码
    public GenericDemo03() {
        objArr = (T[])new Object[10];
    }
}
