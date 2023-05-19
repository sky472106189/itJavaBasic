package com.itpw.day14.io流.c_对象专属流_掌握;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
    反序列化集合
*/
public class ObjectInputStreamDemo02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("src/com/itpw/day14/io流/resource/users"));
        // 反序列化
        Object o = ois.readObject();
        if(o instanceof List){
            List<User> userList = (List<User>) o;
            for (User user : userList) {
                System.out.println(user);
            }
        }

        //关闭
        ois.close();
    }
}
