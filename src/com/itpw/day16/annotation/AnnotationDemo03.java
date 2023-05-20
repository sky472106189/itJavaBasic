package com.itpw.day16.annotation;


/*
    @Deprecated表示此方法或类已过时
*/
public class AnnotationDemo03 {
    public static void main(String[] args) {
        MyClass.oldFunc();
        MyClass.newFunc();
    }

}
class MyClass {


    @Deprecated
    public static void oldFunc(){
    }

    public static void newFunc(){}
}