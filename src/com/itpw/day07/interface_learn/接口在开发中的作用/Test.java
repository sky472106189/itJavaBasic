package com.itpw.day07.interface_learn.接口在开发中的作用;


public class Test {
    public static void main(String[] args) {
        // 创建厨师对象
        FoodMenu cooker1 = new ChinaCooker();

        // 创建顾客对象
        Customer customer = new Customer(cooker1);
        // 顾客面向菜单点菜
        customer.order();
    }
}
