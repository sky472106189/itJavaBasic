package com.itpw.day06.finallearn;

/*
    final修饰实例变量
        结论：final修饰的实例变量，系统不会赋默认值，必须要求手动赋值。
        而手动赋值可以直接在变量后赋值，也可以通过构造方法赋值
    实例变量在什么时候赋值（初始化）？
        构造方法执行的过程中赋值（new的时候赋值）
*/
public class FinalDemo03 {

    public static void main(String[] args) {
    }
}

class User{
    // 实例变量 ，如果实例变量没有手动赋值，系统会赋默认值
    int age;
    // final修饰实例变量 编译报错:【变量“id”可能尚未初始化】
    // 虽然有默认值，但是仍要手动赋值，这是java开发设定好的
    //final int id;
    final int id = 0; //编译通过

    // final这样赋值也是可以的
    // 原理是构造方法会给实例变量age，name赋默认值。即this.age=0;this.name=null;
    // 这些是对程序员透明的，但是底层执行了的。那么我们在构造方法中手动赋值就覆盖了默认值
    final String name;
    public User() {
        this.name = "str";
    }
    public User(String res){
        this.name = res;
    }

    //这样也行 注意static不能删掉
    final static String idCard;
    static {
        idCard = "123";
    }

}
