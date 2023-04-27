package com.itpw.day06.superlearn;

/*
    如果父类和子类有同名属性，并且想要通过子类访问父类属性，则super.不能省略
*/
public class SuperDemo05 {
    public static void main(String[] args) {
        Vip1 v = new Vip1("张三");
        v.shopping();
        /*
        输出：
        null正在购物
        张三正在购物
        null正在购物*/
    }
}

class Customer1{
    String name;

    public Customer1(){}
    public Customer1(String name){
        this.name=name;
    }
}
class Vip1 extends Customer1{

    // 和父类属性同名
    String name;

    public Vip1(){}
    public Vip1(String name){
        super(name);
        // 隐藏了一条 this.name=null;
    }
    public void shopping(){
        System.out.println(this.name+"正在购物");
        System.out.println(super.name+"正在购物");
        System.out.println(name+"正在购物");
    }
}
