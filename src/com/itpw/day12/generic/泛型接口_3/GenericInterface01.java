package com.itpw.day12.generic.泛型接口_3;

/*
    泛型接口的定义语法:
        interface 接口名称<泛型标识,泛型标识…>{
            泛型标识 方法名<>;
            ……
        }

    泛型接口的使用
        1、实现类不是泛型类时，实现类要明确泛型类型
        2、实现类也是泛型类时，实现类和接口类的泛型类型要一致
*/
public class GenericInterface01 {
    public static void main(String[] args) {
        FlyAble<String> demo = new BirdGeneric<String,Integer>("zs",12);
    }
}

// 泛型接口
interface FlyAble<T>{
    void fly();
}

// 泛型接口实现类，必须指明泛型类型
class Bird implements FlyAble<String> {
    @Override
    public void fly() {
        System.out.println("bird flying");
    }
}

class BirdGeneric<T,E> implements FlyAble<T> {
    private T name;
    private E id;

    public BirdGeneric(T name, E id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void fly() {
        System.out.println("bird flying");
    }
}
