package com.itjavase.confused.staticdemo;


public class Demo01 {
    public static void main(String[] args) {
        // 对静态变量的访问，使用【类名.】的方式访问
        // 这是因为静态变量是类级别的，随着类的加载就完成了初始化，存在方法区中，且仅存一份
        System.out.println(Student.name);
        // 可以先使用【引用.】的方式，但是不推荐
        Student stu = new Student();
        System.out.println(stu.name);

        // 对实例变量的访问，只能使用【引用.】的方式
        // 这是因为实例变量存在堆内存中，堆内存必须要new对象开辟空间才存在
        Student student = new Student();
        System.out.println(student.age);

        // 调用Student的无参构造方法，操作方法区中的count变量，由于仅存一份
        // 共调用了两次无参方法，所以count=2;
        System.out.println(Student.count);
        System.out.println(stu.count); //用【引用.】的方式访问静态变量，其值有变化
    }
}
class Student{
    // 静态变量(方法区)
    static String name;
    // 实例变量(堆中)
    int age;

    static int count;

    public Student(){
        count++;
    }

    public static void getCountStatic(){
        count++;
    }
}
