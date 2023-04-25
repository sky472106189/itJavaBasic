package com.itpw.day05.多态.unit2;

public class Master {

    /*
    // 不用多态就要一个个书写这些代码
    public void feed(Cat cat){
        cat.eat();
    }
    public void feed(Bird bird){
        bird.eat();
    }
    public void feed(Dog dog){
        dog.eat();
    }
    */

    // 多态的好处在这里体现
    // 如果不用父类Pet用子类，那么后续每新增一个宠物的eat方法都要新增一个方法,使代码不够简化
    public void feed(Pet pet){
        pet.eat();
    }
}
