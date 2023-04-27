package com.itpw.day05.override;

/*
* 方法覆盖(重写)几个注意事项：
*   1.方法重写只是针对方法，和属性无关
*   2.私有方法无法重写
*   3.构造方法不能被继承，所有构造方法也不能被重写
*   4.方法重写只是针对于实例方法，静态方法重写没有意义
* */
public class OverrideDemo01 {

    public static void main(String[] args) {
        Son son = new Son();
        Daughter dau = new Daughter();
        // 方法覆盖
        son.doSome();
        // 未方法覆盖
        dau.doSome();
    }
}

class Father{
    public void doSome(){
        System.out.println("doSome");
    }
}

class Son extends Father{
    public void doSome(){
        System.out.println("覆盖");
    }
}

class Daughter extends Father{
}
