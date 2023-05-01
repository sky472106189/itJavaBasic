package com.itpw.day09.homework.模拟栈;

/**
 * 第一题：使用一维数组，模拟栈数据结构
 * 要求：
 *   1、栈能存储任何引用类型的数据
 *   2、栈中提供push方法压栈（栈满了，要有提示信息）
 *   3、栈中提供pop方法弹栈（栈空了，要有提示信息）
 *   4、编写测试程序，new栈对象，调用push，pop方法模拟压栈弹栈的动作
 */
public class Test01 {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("————————————————————————————————————");
        Stack stack2 = new Stack(3);
        stack2.push(new Person(123, "张三"));
        stack2.push(new Person(1, "李四"));
        stack2.push(new Object());
        stack2.push(new Person(1, "王五"));
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}

// 栈
class Stack {
    // 栈中存储的引用类型
    private Object[] objs;
    // 栈容量
    private int size;
    // 栈中已多少数量
    private int num;

    public void push(Object obj) {
        if (num >= size) {
            System.out.println("栈已满，无法压栈");
        } else {
            objs[num] = obj;
            this.num++;
            System.out.println("压栈成功，当前栈剩余容量为" + (size - num));
        }
    }

    public Object pop() {
        if (num == 0) {
            return "栈为空，无法弹栈";
        } else {
            return objs[--num];
        }
    }

    public Stack() {
        this(10);
    }

    public Stack(int size) {
        this.size = size;
        this.objs = new Object[size];
    }


    public Object[] getObjs() {
        return objs;
    }

    public void setObjs(Object[] objs) {
        this.objs = objs;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class Person {
    private int idCard;
    private String name;

    public Person() {
    }

    public Person(int idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard=" + idCard +
                ", name='" + name + '\'' +
                '}';
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}