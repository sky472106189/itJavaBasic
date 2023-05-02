package com.itpw.day11.interger;

/*
    基本数据类型            包装类型
  -------------------------------------------
    char                    java.lang.Character(父类Object)
    byte                    java.lang.Byte(父类Number)
    short                   java.lang.Short(父类Number)
    int                     java.lang.Integer(父类Number)
    long                    java.lang.Long(父类Number)
    float                   java.lang.Float(父类Number)
    double                  java.lang.Double(父类Number)
    boolean                 java.lang.Boolean(父类Object)

    重点学习Integer，其他包装类依葫芦画瓢
*/
public class IntegerDemo02 {
    public static void main(String[] args) {
        // 基本数据类型->包装类 (装箱)
        Integer integer = new Integer(123);
        // 包装类->基本数据类型 (拆箱)
        float v = integer.floatValue();
    }
}
