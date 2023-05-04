package com.itpw.day08.内部类.实例内部类;

// 汽车类
public class Car {

    public static final String brand = "马自达";
    String name = "2023款马自达";

    private String privateName = "私人马自达";

    // 实例内部类 引擎
    public class Engine{
        String name = "雕牌引擎";
        private String privateName = "私人雕牌引擎";

        public void fire(){

            String name = "马氏点火";
            System.out.println(name);// 马氏点火
            System.out.println(this.name);// 雕牌引擎
            System.out.println(Car.this.name);// 2023款马自达

            String privateName = "私人马氏点火";
            System.out.println(privateName);// 私人马氏点火
            System.out.println(this.privateName);// 私人雕牌引擎
            System.out.println(Car.this.privateName);// 私人马自达
        }
    }
}
