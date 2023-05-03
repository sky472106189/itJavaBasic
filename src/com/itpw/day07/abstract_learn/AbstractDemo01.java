package com.itpw.day07.abstract_learn;

/*
    抽象类
        1、什么是抽象类
            类和类之间具有共同特征，将这些共同特征提取出来，形成抽象类
            类本身是不存在的，所以抽象类无法创建对象
        2、抽象类属于什么类型
            抽象类属于引用类型。
        3、抽象类语法
            [修饰符列表] abstract class 类名{
                类体;
            }
        4、抽象类是天生用来被子类继承的
        5、抽象类的子类可以是抽象类
        6、抽象类虽然无法实例化，但是抽象类有构造方法，是供子类使用的
        7、抽象类中存在抽象方法，是一个没有方法体的方法，如：
            public abstract void doSome();
            特点:没有方法体，修饰符有abstract关键字，且抽象方法必须被子类重写
*/
public class AbstractDemo01 {
    public static void main(String[] args) {
        // 编译报错：“Account”是抽象的;无法实例化
        //Account account = new Account();
        Account creditAccount = new CreditAccount();
    }
}

// 银行账户类(抽象类)
abstract class Account {
    // CreditAccount类编译报错：'Account没有可用的默认构造函数。'
    // 这是因为定义了有参的构造那么会使无参构造消失，需要手动加上
    // 结论：每一个类无论抽象与否都默认有一个无参构造
    //public Account(String name){}

    // 非抽象方法
    public void doOther(){
    };

    // 抽象方法
    public abstract int doSome();
}

abstract class Credit{
    public String name;
    private String stt;
    protected String s;
    public void doSOme(){};
}

// 继承抽象类
class CreditAccount extends Account{

    // 必须重写父亲抽象类中的抽象方法
    @Override
    public int doSome() {
        return 0;
    }
}
