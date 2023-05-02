package com.itpw.day11.enum_learn;
/*
    Java 中的每一个枚举都继承自 java.lang.Enum 类
    当定义一个枚举类型时，每一个枚举类型成员都可以看作是 Enum 类的实例，
    大部分枚举成员默认都被 public、final、 static 修饰，其中枚举类中的变量默认final修饰
    当使用枚举类型成员时，直接使用枚举名称调用成员即可。
    所有枚举实例都可以调用 Enum 类的方法，常用方法有：1、values() 2、valueOf() 3、name() 4、ordinal()

    枚举适用场景:
        结果超过两种，且结果是有限个的建议使用枚举类型。而且枚举名设计合理
    能大大增强代码的可读性。例如：四季，星期，性别，线程状态

*/
public class EnumDemo02 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);// Season{seasonName='夏天', seasonDesc='夏日炎炎'}

        // name()
        System.out.println(summer.name());// SUMMER

        // values()
        Season1[] seasonArray = Season1.values();
        for (int i = 0; i < seasonArray.length; i++) {
            System.out.println(seasonArray[i]);
        }

        // valueOf(String objName):返回当前枚举类中名称为objName的枚举类对象
        // 如果没有抛出异常:IllegalArgumentException
        String objName = "WINTER1";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        // ordinal(); (静态方法)(了解)
        int inedx = Season1.AUTUMN.ordinal();
        System.out.println(inedx);

    }
}

// 使用enum定义枚举 和不使用enum定义枚举的Season类 进行对比
enum Season1{

    //1.提供当前枚举类的对象，多个对象用,隔开，末尾用
    // 默认public static final
    SPRING ("春天","春暖花开"),
    SUMMER ("夏天","夏日炎炎"),
    AUTUMN ("秋天","秋高气爽"),
    WINTER ("冬天","冰天雪地");

    // 默认有final修饰了，但是权限修饰符可以改
    private String seasonName;
    private String seasonDesc;

    // 2.私有化构造器，并给元素赋值
    Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 4.其他需求:获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
