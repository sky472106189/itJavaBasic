package com.itpw.day12.generic.泛型类_1;

/*
 自定义泛型类
   语法：
       class 类名 <泛型标识,泛型标识,…>{
           类体
       }
   常用泛型标识：T、E、K、V
*/
public class GenericDemo01 {
    public static void main(String[] args) {
        // <String>指定了泛型标识，使Generic类中的<T>都是String类型
        Generic<String> strGeneric = new Generic<>("abc");
        System.out.println( strGeneric.getKey());

        Generic<Integer> intGeneric = new Generic<>(100);
        System.out.println(intGeneric.getKey());

        //泛型类创建时未指定泛型，将按照Object类型来操作
        Generic generic = new Generic("ABC");
        Object key2 = generic.getKey();
        System.out.println(key2);

        // 泛型不支持基本数据类型
        //Generic<int> generic1 = new Generic<>();
    }
}

/***
 * 泛型类的定义
 * @param <T> 泛型标识
 *            T 创建对象时指定的具体数据类型
 */
class Generic<T>{
    // T是由外部使用类时来指定的
    private T key;

    public Generic() {
    }

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
