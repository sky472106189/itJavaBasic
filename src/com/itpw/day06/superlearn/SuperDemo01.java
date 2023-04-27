package com.itpw.day06.superlearn;

/*
    super和this对比学
        一、this：
            this能出现在实例方法和构造方法中
            this的语法是【this.】，【this()】
            this不能使用在静态方法中
            this.大部分情况可以省略
            this.在区分局部变量和实例变量时不能省略，如：
                public void setName(String name){
                    this.name = name;
                }
            this()只能出现在构造方法第一行，通过当前的构造方法去调用“本类”中
        其他的构造方法，旨在：代码复用
        二、super：
                super能出现在实例方法和构造方法中
                super的语法是【super.】，【super()】
                super不能使用在静态方法中
                super.大部分情况可以省略
                super不能省略的情况？？？
                super()只能出现在构造方法第一行，通过当前的构造方法去调用“本类”中
            其他的构造方法，旨在：创建子类型对象时，先初始化父类型特征。
        三、super()
                表示通过子类的构造方法调用父类的构造方法。
        四、重要结论：当构造方法第一行既没有this()有没有super()的话，默认会有一个super();
            表示当前子类构造方法调用父类的构造方法，所以必须保证父类的无参构造方法是存在的
        五、super()和this()不能共存于一个构造方法中
        六、无论如何，父类的构造方法都会执行
*/
public class SuperDemo01 {
    public static void main(String[] args) {
        new B();// 输出：A的无参构造B的无参构造

    }
}

class A{
    public A(){
        System.out.print("A的无参构造");
    }
}

class B extends A{
    public B(){
        //this() 单写一个this()是无法执行的，因为自身无参构造方法不能再调用自身的无参构造方法
        // super(); 隐含了一个super()
        System.out.print("B的无参构造");
    }
}

// 编译报错的，很显然C的无参调用了C的有参，而C的有参又调用C的无参，就想蛇吞蛇一样，没有尽头。且父类构造完全没法执行，故编译不通过
//class C extends A{
//    int id;
//    public C(){
//        this(1);
//        System.out.println("C的无参构造方法");
//    }
//
//    public C(int id){
//        this();
//        System.out.println("C的有参构造方法");
//    }
//}