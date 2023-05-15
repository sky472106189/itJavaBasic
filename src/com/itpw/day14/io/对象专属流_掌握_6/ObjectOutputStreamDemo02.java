package com.itpw.day14.io.对象专属流_掌握_6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
* 1、反序列化多个对象
*       其中ArrayList集合和结合中的元素都需要实现Serializable接口
* 2、如果不想对象中某个元素参与序列化，可以使用transient关键字
*       比如User类的name属性就没有参与序列化
* */
public class ObjectOutputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        List<User> users = new ArrayList<>();
        users.add(new User(1,"张三"));
        users.add(new User(2,"李四"));
        users.add(new User(3,"王五"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/com/itpw/day14/io/resource/users"));
        // 序列化一个集合，集合中都是User对象
        oos.writeObject(users);

        // 刷新
        oos.flush();
        // 关闭
        oos.close();
    }
}

class User implements Serializable {
    private int id;
    private transient String name;

    public User() {
    }

    public User(int id, String name) {
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
