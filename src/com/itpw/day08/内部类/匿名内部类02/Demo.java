package com.itpw.day08.内部类.匿名内部类02;

public class Demo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.say();

        // 匿名内部类直接实现抽象方法
        Animal animal = new Animal() {
            @Override
            public void say() {
                System.out.println("只因你太美");
            }
        };  //别忘了这个分号
        animal.say();

        // 使用场景:方法参数是抽象类或接口时，可以使用匿名内部类简化写法
        // 如果方法实现简单，推荐使用匿名内部类。如果方法实现复杂，推荐定义子类
        animalPkSay(new Animal() {
            @Override
            public void say() {
                System.out.println("鹅鹅鹅，曲项向天歌");
            }
        });
    }

    public static void animalPkSay(Animal animal){
        System.out.println("比赛开始");
        animal.say();
        System.out.println("比赛结束");
    }
}

abstract class Animal{
    public String name;
    public abstract void say();
}

class Dog extends Animal{
    @Override
    public void say() {
        System.out.println("汪汪叫");
    }
}
