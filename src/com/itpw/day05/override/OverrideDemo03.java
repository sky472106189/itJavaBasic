package com.itpw.day05.override;

/*
    私有方法无法重写（记住就好）
*/
public class OverrideDemo03 {

    // 私有方法
    private void doSome(){
        System.out.println("OverriderDemo03私有方法执行。。。");
    }

    //入口
    public static void main(String[] args) {
        OverrideDemo03 od = new T();
        od.doSome();//OverriderDemo03私有方法执行。。。
    }
}

class T extends OverrideDemo03{
    // 尝试重写父类中doSome()方法
    // 访问权限不能更低，可以更高
    public void doSome(){
        System.out.println("T的公共方法执行。。。。");
    }
}
