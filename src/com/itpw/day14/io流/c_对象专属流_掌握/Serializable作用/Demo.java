package com.itpw.day14.io流.c_对象专属流_掌握.Serializable作用;

import java.io.*;

/*
 探究Serializable接口的作用，以及为什么建议手写序列化版本号
    Serializable的实现类，建议给该类一个固定不变的版本号。这样即使以后代码修改了，
    由于版本号不变，JVM也会认定这是同一个类
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        // 测试步骤
        // 第一轮:1、Student类注销age属性，不手写序列化版本好，先执行serial()。
        //        2、然后注销serial()方法，Student类新增age属性，执行reverseSerial(),此时报错
        // 第二轮:1、Student类注销age属性，手写序列化版本号，先执行serial()。
        //        2、然后注销serial()方法，Student类新增age属性，执行reverseSerial(),此时顺利通过
        // serial();
        reverseSerial();
    }

    /**
     * 序列化
     */
    public static void serial() throws Exception {
        // 创建java对象
        Student s1 = new Student(111,"张三");
        // 创建输出流(序列化流)(JVM中的java对象状态保存到硬盘中)
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("src/com/itpw/day14/io流/resource/Student"));
        // 序列化对象
        oos.writeObject(s1);
        //刷新
        oos.flush();
        //关闭
        oos.close();
    }

    /**
     * 反序列化
     */
    public static void reverseSerial () throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/itpw/day14/io流/resource/Student"));
        // 开始反序列化
        Object o = ois.readObject();
        // 反序列化回一个student对象，所以会调用student的toString方法
        System.out.println(o);
        ois.close();
    }
}


