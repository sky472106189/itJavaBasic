package com.itpw.day14.io.对象专属流_掌握_6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
    java.lang.Object
    java.io.OutputStream
        java.io.ObjectOutputStream :序列化JAVA对象到硬盘  (Serial)
        java,io,ObjectInputStream :将硬盘中的数据"反序列化"到JVM内存 (DeSerial)

    Compile 编译 (java-->class)
    DeCompile 反编译(class-->java)

    1、参与序列化和反序列化的对象必须实现Serializable接口
    否则报错 java.io.NotSerializableException

    2、注意：Serializable接口是一个标志接口：里面什么都没有
    起到一个标识的作用，JVM看到实现Serializable接口的类，可能会对其有特殊待遇
    Serializable标志接口提供给JVM，JVM看到后，会为该实现类自动生成一个序列化版本号

    3、序列化版本号有什么用？
        如果我们序列化Student，然后给Student类做修改，然后用Oos去反序列化，就会报错如下：
            java.io.InvalidClassException:
            com.itpw.day14.io.对象专属流_掌握_6.Student;
            local class incompatible:
                stream classdesc serialVersionUID = 2831870326451292969, （十年后）
                local class serialVersionUID = -4287548872569531787 （十年前）

        java语言中是采用什么机制区分类的？
            第一：首先通过类名进行比对，类名不同，则不是同一个类
            第二：类名相同，则靠序列化版本号进行区分

        请思考：自动化序列化版本号有什么缺陷？
            一旦代码确定之后，不能进行后续更改，因为只要修改了就会重新编译，生成新的序列化版本号。
            此时的JVM会认为这是一个全新的类

        结论：Serializable的实现类，建议给该类一个固定不变的版本号。这样即使以后代码修改了，
        但是版本号不变，JVM也会认定这是同一个类
*/
public class ObjectOutputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 创建java对象
        Student s1 = new Student(111,"张三");
        // 创建输出流(序列化流)(JVM中的java对象状态保存到硬盘中)
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream("src/com/itpw/day14/io/resource/Student"));
        // 序列化对象
        oos.writeObject(s1);

        //刷新
        oos.flush();
        //关闭
        oos.close();

    }
}

class Student implements Serializable {

    // JVM看到Serializable接口，会自动生成一个序列化版本号
    // 这里没有手动写出来，JVM就会默认提供一个序列化版本号
    // 建议将序列化版本号手写
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}