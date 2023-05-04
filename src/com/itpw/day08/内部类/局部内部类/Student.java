package com.itpw.day08.内部类.局部内部类;

public class Student {

    public void study(){
        // 局部内部类，随着study()方法的执行而消失
        class PlayMobile{
            public void show(){
                System.out.println("实例方法中的局部内部类playMobile，show方法执行了");
            }
        }
        PlayMobile mobile = new PlayMobile();
        mobile.show();
    }
}
