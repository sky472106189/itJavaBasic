package com.itpw.day03;

/*
* 实例代码块(用得少)
* 实例代码块在类加载时并没有执行
*   语法：
*   {
*     代码;
*   }
*
*   实例代码块在什么时候执行？
*       只要是构造方法执行,就会在构造方法之前自动执行
*
*   使用场景:
*       类的所有构造方法在前几行代码都一样，比如构造方法前都要声明一个变量i
*   那么就可以声明变量i放在实例代码块，降低冗余
* */
public class InstanceCode {
    public static void main(String[] args) {
        System.out.println("main begin");
        new InstanceCode();
    }

    // 实例代码块
    {
        System.out.println("实例代码块执行");
    }

    public InstanceCode(){
        System.out.println("无参构造方法");
    }

    public InstanceCode(String name){
        System.out.println("有参构造方法");
    }
}
