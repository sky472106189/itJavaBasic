package com.itpw.day12.generic.泛型方法_2;

import java.util.ArrayList;
import java.util.Random;

/*
    注意区分泛型方法和泛型类
    泛型方法语法：
        修饰符<T,E...> 返回值类型 方法名 (形参){
            方法体...
        }
    1、public与返回值中间<T>非常重要，区分泛型方法与泛型类中方法的关键
    2、<T>表明该方法将使用泛型类型T，此时才可以在方法体重使用泛型T
    3、泛型方法支持静态，泛型类中方法不支持静态
    4、泛型方法更加灵活。
*/
public class GenericMethod01 {
    public static void main(String[] args) {
        // 泛型类 规定String
        ProductGetter<String> pg = new ProductGetter<>();

        // 泛型方法 规定Integer
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //调用泛型方法
        //其中T = Integer; E = String;
        Integer product1 = pg.getProduct1(list);
        String product2 = pg.getProduct2(list);
        int product3 = pg.getProduct3(list);

    }
}

class ProductGetter<T>{
    Random random = new Random();
    private ArrayList<T> list = new ArrayList<>();

    // 这个不是泛型方法
    public T getProduct(){
        T product = list.get(random.nextInt(list.size()));
        return product;
    }

    // 报错
    // public static T getStaticProduct(){}

    // 泛型方法
    public <E> E getProduct1(ArrayList<E> list){
        return list.get(random.nextInt(list.size()));
    }

    public <E> T getProduct2(ArrayList<E> list){
        return (T)list.get(random.nextInt(list.size()));
    }

    public <E> int getProduct3(ArrayList<E> list){
        return (Integer) list.get(random.nextInt(list.size()));
    }

    // 泛型方法支持静态
    public static <E> E getStaticProduct1(ArrayList<E> list){
        return list.get(new Random().nextInt(list.size()));
    }
}