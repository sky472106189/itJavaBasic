package com.itpw.day05.多态.unit2;
/*
* 多态开发中的作用？
*   降低程序耦合度，提高程序扩展力
* 软件开发有七大原则，其中最重要的一个原则是OCP:开闭原则。即软件实体应该可以扩展，但是不可修改
* （1）对扩展开放（open）（2）对修改关闭（closed） 的设计原则。
* 摘自:https://zhuanlan.zhihu.com/p/523095047
* */
public class Demo {
    public static void main(String[] args) {
        Bird bird=new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Master master=new Master();
        master.feed(bird);
        master.feed(cat);
        master.feed(dog);
    }
}
