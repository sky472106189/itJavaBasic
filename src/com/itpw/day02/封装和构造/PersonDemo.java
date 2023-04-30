package com.itpw.day02.封装和构造;

/*
* Q:get和set存在的意义是什么？(封装的意义是什么)
* A:1.可以通过方法的途径来操纵属性的设值和取值，掌握控制权。
*   （比如return特定格式的属性值，根据你自己需求去改造get或set中的限制）
*   2.可以设置属性权限。（例如只写get而不写set，该属性就只可读而不可写）
* */
public class PersonDemo {

    public static void main(String[] args) {
        Person p = new Person();

        //错误语法 set方法不是静态方法,不能使用【类名.方法】的形式调用
        //Person.setId(1)
        p.setId(-1);
        p.setName("123");
        //id赋值失败 导致是默认值0
        System.out.println(p.getId());
    }
}
