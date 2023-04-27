package com.itpw.day06.superlearn;

public class SuperDemo04 {
    public static void main(String[] args) {
        Vip v = new Vip("张三");
        v.shopping();
        /*
        输出：张三正在购物
              张三正在购物
              张三正在购物
        */
    }
}

class Customer{
    String name;

    public Customer(){}
    public Customer(String name){
        this.name=name;
    }
}
class Vip extends Customer{

    public Vip(){}
    public Vip(String name){
        super(name);
    }
    public void shopping(){
        System.out.println(this.name+"正在购物");
        System.out.println(super.name+"正在购物");
        System.out.println(name+"正在购物");
    }
}
