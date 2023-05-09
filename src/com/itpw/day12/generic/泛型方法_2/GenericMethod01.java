package com.itpw.day12.generic.泛型方法_2;

import java.util.Arrays;

/*
    泛型方法：
        语法： 修饰符 <T,R..> 返回类型 方法名(形参){...}

    注意：
      1、泛型方法可以定义在普通类中，也可以在泛型类中
      2、泛型方法支持静态修饰，泛型方法更加灵活
      3、当泛型方法被调用时，类型会确定
      4、public与返回值中间<T>非常重要，是区分泛型方法与普通方法的关键
      5、<T>表明该方法将使用泛型类型T，此时才可以在方法体中使用泛型T
*/
public class GenericMethod01 {
    public static void main(String[] args) {
        Animal<String> a = new Animal<>();
        // 编译不通过，因为bark()方法第一个参数由泛型类指定，第一个泛型是String
        // a.bark(123,3.15);
        a.bark("123",3.15);
    }
}

//普通类
class Cat {
    // 实例方法
    public void eat() {}

    // 泛型方法（普通类）
    // <T,R>是泛型，提供给fly使用的
    public <T, R> void fly(T t, R r) {
    }
}

// 泛型类
class Animal<T>{

    public void eat(){
    }

    // 泛型方法（泛型类）
    public <U,R> void fly(U u,R r){

    }

    // 泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    // U来自泛型方法，T来自泛型类
    public <U> void bark(T t,U u){
        System.out.println(t.getClass());
        System.out.println(u.getClass());
    }

    // 不是泛型方法
    public void move(T t){}


}