package com.itpw.day05.override;

/*
    为什么【方法重写只是针对于实例方法，静态方法重写没有意义】
    1.静态方法不存在方法重写，多态建立在对象的前提下
      而静态方法的执行不需要对象，所以一般情况下，我们会说静态方法“不存在”方法重写
    2.方法重写只是针对于“实例方法”，“静态方法重写”没有意义
*/
public class OverrideDemo02 {
    public static void main(String[] args) {
        Animal a = new Cat();
        // 静态方法可以使用【引用.】来调用，但是仍和对象无关
        // 实际运行还是Animal.doSome();
        // 按照多态的理解应该出现的是Cat执行才对 为什么呢？看头顶的注释解答
        a.doSome(); //Animal执行

        Cat.doSome();//Cat执行
    }
}

class Animal{
    public static void doSome(){
        System.out.println("Animal执行");
    }
}

class Cat extends Animal{
    public static void doSome(){
        System.out.println("Cat执行");
    }
}