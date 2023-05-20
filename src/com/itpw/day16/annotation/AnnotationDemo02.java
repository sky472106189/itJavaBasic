package com.itpw.day16.annotation;

/*
    JDK内置的注解
        1、(掌握)Deprecated 用 @Deprecated 注释的程序元素，不鼓励程序员使用这样的元素，通常是因为它很危险或存在更好的选择。
        2、(掌握)Override 表示一个方法声明打算重写超类中的另一个方法声明。
        3、(了解)SuppressWarnings 指示应该在注释元素（以及包含在该注释元素中的所有程序元素）中取消显示指定的编译器警告。

    元注解:
        用来标注注解类型的，称为元注解
    常见的元注解:
        @Target
        @Retention

    @Target:指定注解生效范围
        @Target(ElementType.METHOD) 表示注解只能出现在方法上
        @Target(ElementType.ANNOTATION_TYPE)  表示此注解是元注解
        @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})

    @Retention:指定注解保存位置
        @Retention(RetentionPolicy.SOURCE):表示注解只被保留在java源文件中
        @Retention(RetentionPolicy.CLASS):表示注解只被保留在.class文件中
        @Retention(RetentionPolicy.RUNTIME):表示注解只被保留在.class文件中，并且可以被反射机制读取


*/
public class AnnotationDemo02 {

    /*
    @Override只能直接方法，给编译器参考的，和运行阶段没有关系
    */
    @Override
    public String toString() {
        return super.toString();
    }
}
