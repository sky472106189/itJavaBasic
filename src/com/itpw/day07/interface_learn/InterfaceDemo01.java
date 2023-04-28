package com.itpw.day07.interface_learn;

/*
    可以只看下面的13条总结，后面的Demo01-04不必要研究
    接口:
        1、接口也是引用类型
        2、接口是特殊的抽象类，特殊在6、7、8、9。14有总结具体不同
        3、接口语法：
            [修饰符列表] interface 类名{ }
        4、接口支持多继承，抽象类和普通类不支持多继承
        5、接口类只支持两部分内容，一部分是常量，一部分是抽象方法
        6、接口类所有元素都是public修饰,不能手动修改
        7、接口类中的方法默认有public abstract修饰，日常开发可以不写
        8、接口类中的常量默认有public final static修饰，日常开发可以不写
        9、接口类中的方法都没有方法体
        10、非抽象类实现接口的方法，必须实现接口中的所有方法
        11、类不支持多继承，但是支持多实现
        12、extends和implements可以共存，extends在前，implements在后
        13、使用接口写代码，可以使用多态
        14、抽象类中有构造方法，接口中没有构造方法
            接口和接口之间支持多继承，类和类只能单继承
            一个类能实现多个接口，一个类只能继承一个抽象类
            接口中只允许出现常量和抽象方法
*/
public class InterfaceDemo01 {
    public static void main(String[] args) {

    }
}

// 接口
interface A {
}
interface B extends A {
}
// 接口支持多继承
interface C extends A, B {
}

interface MyMath{
    //不推荐的常量定义
    public static final String COUNTRY = "中国";
    //可省，日常开发用
    double PI=3.141592653;

    //不推荐的方法定义
    public abstract void carry();
    // 接口中public abstract可以省略
    int sum(int a,int b);
}
