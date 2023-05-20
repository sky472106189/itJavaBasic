package com.itpw.day16.annotation;

/*
    1、注解，英文名字Annotation
    2、注解是一种引用类型。编译之后也会生成.class文件
    3、自定义注解的语法格式:
        [修饰符列表] @interface 注解类姓名{
            ...
        }
    4、注解使用要求
        @注解类型名
        默认情况下注解几乎可以用在任何地方

*/
@Deprecated
public class AnnotationDemo01 {
    @Deprecated
    private int no;
    @Deprecated
    public AnnotationDemo01() {
    }

}
