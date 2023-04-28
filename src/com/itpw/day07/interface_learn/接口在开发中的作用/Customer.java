package com.itpw.day07.interface_learn.接口在开发中的作用;

//顾客类
public class Customer {
    //顾客手上有一个菜单，所以顾客有一个实例变量，FoodMenu
    // 每一个FoodMenu都归属一个顾客
    private FoodMenu foodMenu;

    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    /***
     * 点菜
     */
    public void order(){
        //先拿到菜单才能点菜
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRousi();
    }
}
