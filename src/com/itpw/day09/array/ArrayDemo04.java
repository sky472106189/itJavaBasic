package com.itpw.day09.array;

/**
 * 一维数组的深入，数组的存储类型为：引用数据类型
 *  对于数组来说，实际上只能存储java对象的“内存地址”。数组中存储的每个元素是“引用”
 * */
public class ArrayDemo04 {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(),new Animal()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        // Animal数组可以存放Cat类型的数据，因为Cat是Animal的子类
        animals[1] = new Cat();
        animals[1].move();
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move....");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
}