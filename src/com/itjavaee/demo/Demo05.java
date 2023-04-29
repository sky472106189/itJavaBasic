package com.itjavaee.demo;

public class Demo05 {
    public static void main(String[] args) {
        Peter.func1();

        // 编译不通过,因为实例方法需要先new对象
        //Peter.func2();
        Peter peter = new Peter();
        peter.func2();
    }

    // 实例方法
    public void mainFunc(){
        // 即使放在实例方法中也需要先new对象才能调用实例方法
        //Peter.func2();
        Peter peter = new Peter();
        peter.func2();

        // 实例方法中也能通过【类名.】的方式调用静态方法
        Peter.func1();

    }
}

class Peter{
    public static void func1(){
        System.out.println("静态func1");
    }
    public void func2(){
        System.out.println("普通func2");
    }
}
