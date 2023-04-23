package com.ithm.day07.objdemo.upgrade;

import java.util.List;

/***
 * 冰箱类 v1.1
 *  改进:能存放多个物品的冰箱
 */
public class Refrigerator {
    // 出厂号
    private int id;
    // 品牌名
    private String brand;
    // 存放物
    private List objList;

    /***
     * 打开冰箱
     */
    public void openIt(){
        System.out.println(brand+"品牌冰箱已打开");
    }

    /***
     * 存入冰箱
     * @param list 存放物集合
     */
    public void putIt(List list){
        this.objList = list;
        System.out.println(list.toString()+"已放入冰箱");
    }

    /***
     * 关闭冰箱,并且展示存放物
     */
    public void closeIt(){
        System.out.println(brand+"品牌冰箱已关闭,里面存放的对象是"
                +this.objList.toString());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
