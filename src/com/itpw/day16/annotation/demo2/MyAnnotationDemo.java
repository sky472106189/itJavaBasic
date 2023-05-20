package com.itpw.day16.annotation.demo2;

public class MyAnnotationDemo {
    @MyAnnotation(age=18,emails = {"123","345","567"})
    public void func1(){
    }

    @MyAnnotation(age=18,emails = "123")
    public void func2(){

    }
}
