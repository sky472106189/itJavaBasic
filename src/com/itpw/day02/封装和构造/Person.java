package com.itpw.day02.封装和构造;

public class Person {
    private int id;
    private String name;
    
    // 有参的构造方法一旦存在 那么必须要有无参的构造方法 这是Java的规定
    public Person(){
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // setter和getter都不能使用static修饰
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<0){
            System.out.println("id不能小于0");
        }else{
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
