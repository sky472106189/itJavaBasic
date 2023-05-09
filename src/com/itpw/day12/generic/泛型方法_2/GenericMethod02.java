package com.itpw.day12.generic.泛型方法_2;

// 练习
public class GenericMethod02 {
    public static void main(String[] args) {
        // T->String;R->Integer;M->Double;
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.doSome(10);// Integer
        apple.doSome("123");// String
    }
}

class Apple<T, R, M> {
    public <E> void doSome(E e) {
        System.out.println(e.getClass().getSimpleName());
    }

    //错误 因为U没有声明在类，也没有泛型方法标识<U>
    // public void eat(U u){}

    public void fly(R r) {
    }
}
