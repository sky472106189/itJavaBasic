package com.itpw.day11.enum_learn;

/*
    (了解)不使用enum，自定义枚举类
        主要学习final以及static的使用场景。
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        // 等价于Season spring = new Season("春天","春暖花开");
        Season spring = Season.SPRING;
        // 如果3.没有用final修饰 是有可能改成null的，所以必须用final修饰
//        Season.SPRING = null;
        System.out.println(spring);
    }
}

// 自定义枚举类
class Season{
    // 1.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;

    // 2.私有化构造器，并给元素赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 3.对外提供当前枚举类的多个对象:public static final修饰
    // 别混淆，这个就是类中的静态变量，供外部访问的
    // 由于构造器私有化，且没有无参构造，那么此方法必须开放一个门给用户，于是只能通过【类名.】的方式来调用
    // 所以要用static修饰
    // 用final修饰是为了静态变量的类加载时就就生成且不可改变。
    // 关于为什么用final？如果不用final修饰，那么执行Season.SPRING = null就会成功
    // 大大降低了枚举的安全性
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");

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