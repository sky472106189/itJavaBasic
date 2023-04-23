package com.itpw.day02.对象和引用.进阶内存图;


public class UserDemo {
    public static void main(String[] args) {
        // 住址对象
        Address adr = new Address();
        adr.city = "北京";
        adr.street = "大兴区";
        adr.zipcode="121221";

        // 用户对象
        User user = new User();
        user.id = 11111;
        user.username = "zhangsan";
        user.addr = adr;

        // 引用对象不一定是局部变量,比如user.addr 就是引用对象充当实例变量
        // 注意区分:局部变量存在栈帧中,实例变量存在堆内存中
        System.out.println(user.addr.street);
    }
}
