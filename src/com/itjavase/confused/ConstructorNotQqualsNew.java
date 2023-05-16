package com.itjavase.confused;

/*
* 构造方法执行并不一定会创建对象
* 摘自:https://www.cnblogs.com/zhangjianbing/p/8072821.html
* */
public class ConstructorNotQqualsNew {
    public static void main(String[] args) {
        // 抽象类无法new对象
//        AbstractObject obj = new AbstractObject();
        SomeObject obj = new SomeObject();
    }
}

abstract class AbstractObject {

    public AbstractObject() {
        System.out.println("抽象类的构造方法执行了!");
    }

}
class SomeObject extends AbstractObject {

    public SomeObject() {
        System.out.println("子类的构造方法执行了!");
    }

}