package com.itpw.day08.object类.tostring_equals;

/*
    1、关于Object类中的equals方法
    源码：
            public boolean equals(Object obj) {
                return (this == obj);
            }

    2、equals()方法目的是什么
        通过此方法判断两个对象是否相等

    3、


*/
public class Demo01 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        // 基本数据类型直接==判断即可
        System.out.println(a == b);   //true

        T t1 = new T("张三");
        T t2 = new T("张三");
        // t1 = 0x123; t2 = 0x445;
        // ==比较的是t1的内存地址和t2的内存地址是否相等
        System.out.println(t1 == t2); //false
        // 如果想比较引用中具体的属性是否相等，需要重写equals方法
        // 在后续的Map类中也是如此要求的,且要重写hashCode方法
        System.out.println(t1.equals(t2)); //true
    }
}

class T {
    private String name;

    // 重写equals方法,并不是特别规范。因为后续equals是要和hashCode一起重写的
    // 注意重写父类方法 必须方法中的形参也要一样 下面这个是不规范的
    //public boolean equals(T t){};
    @Override
    public boolean equals(Object obj) {
        //  如果obj是空 直接返回false
        if (obj == null) {
            return false;
        }
        // 如果this和obj保存的地址一样，返回true;
        if (obj == this) {
            return true;
        }
        // 如果obj不是T类，即不能向下转型了，返回false
        // 注意instanceof
        if (!(obj instanceof T)) {
            return false;
        }
        // 到此说明obj是T类
        T t = (T) obj;
        return (t.getName() == this.name);
    }

    public T() {
    }

    public T(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
