package com.itpw.day14.io.对象专属流_掌握_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/*
    反序列化
*/
public class ObjectInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/com/itpw/day14/io/resource/Student"));
        // 开始反序列化
        Object o = ois.readObject();
        // 反序列化回一个student对象，所以会调用student的toString方法
        System.out.println(o);
        ois.close();

    }
}
