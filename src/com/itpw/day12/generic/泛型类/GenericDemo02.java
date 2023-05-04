package com.itpw.day12.generic.泛型类;

import java.util.ArrayList;
import java.util.Random;

public class GenericDemo02 {
    public static void main(String[] args) {
        // 创建抽奖机，指定奖品类型为String类
        ProductGetter<String> productGetter = new ProductGetter<>();
        // 填充奖品
        productGetter.addProduct("手机");
        productGetter.addProduct("蓝牙耳机");
        productGetter.addProduct("鼠标");

        // 抽奖
        String product = productGetter.getProduct();
        System.out.println("奖品是"+product);
    }

}

/***
 * 抽奖机
 * @param <T> 奖品类型
 */
class ProductGetter<T>{
    Random random = new Random();
    private ArrayList<T> list = new ArrayList<>();

    public void addProduct(T t){
        list.add(t);
    }

    public T getProduct(){
        T product = list.get(random.nextInt(list.size()));
        return product;
    }
}

