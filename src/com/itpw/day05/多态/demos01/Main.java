package com.itpw.day05.多态.demos01;

/*
* 多态父类型指向子类型对象，都会优先调用子类的方法
*   但是对值的直接修改(不通过set方法)只会修改父类的属性,这是一个值得注意的点。
*
* 但是实际开发中很少遇到，因为变量都是封装好的，用getter and setter对外开放修改查看权限，
* 这样本质上还是调用了子类的set方法去修改了子类的值
* */
public class Main {
    public static void main(String[] args) {
        People p = new Student();
        p.id = 123;
        // 并没有修改子类的变量值
        System.out.println(p);//Student{id=0}
        p.doSome();// 但是调用了子类的方法

        // 删除Student类的toString方法输出，只修改了父类的值
        // People{name='null', age=0, id=123}

        // 不出现这个问题只要把封装性做好就好
        // 本质上还是调用了子类的set方法
        // p.setId(123);
    }
}
