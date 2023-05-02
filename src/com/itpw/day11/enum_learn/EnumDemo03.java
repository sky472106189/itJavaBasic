package com.itpw.day11.enum_learn;

/*
* 枚举实现接口
*   情况一：所有枚举的draw()方法执行的方法体相同
* */
public class EnumDemo03 {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.draw();
    }

}

interface draw{
    void draw();
}

// 枚举类 实现接口
enum Color implements draw{
    RED (1,"红色"),
    YELLOW  (2,"黄色");

    private int id;
    private String chinese;



    Color(int id, String chinese) {
        this.id = id;
        this.chinese = chinese;
    }

    // 枚举可以实现接口，并且同样必须实现接口的方法
    @Override
    public void draw() {
        System.out.println("id="+this.id+"的颜色在画画，颜色是"+this.chinese);
    }
}
