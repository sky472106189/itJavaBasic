package com.itpw.day08.object类.tostring_equals;

import java.util.Objects;

public class Demo02 {
    public static void main(String[] args) {
        Address address = new Address("杭州", "钱塘区", "11111");
        User u1 = new User("张三",address);
        User u2 = new User("张三",address);
        System.out.println(u1.equals(u2));  //true

        User user1 = new User("李四",
                new Address("杭州", "钱塘区", "11111"));
        User user2 = new User("李四",
                new Address("杭州", "钱塘区", "11111"));
        // 返回false,因为没有重写Address类的equals方法
        // equals重新方法要彻底，好习惯就是每一个自定义类都重写equals方法
        System.out.println(user1.equals(user2)); //false

    }
}

class User {
    String username;
    Address addr;

    // 重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && addr.equals(user.addr);
    }

    public User() {
    }

    public User(String username, Address addr) {
        this.username = username;
        this.addr = addr;
    }
}

class Address {
    String city;
    String street;
    String zipcode;

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
    }

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
