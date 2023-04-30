package com.ithmbasic.day08;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder类也叫做字符串缓冲区，可以提高字符串的操作效率（可以看成一个长度可以变化的字符串）
        // StringBuilder类的底层也是一个数组，但是没有被final修饰，可以改变长度
        // StringBuilder拼接效率比String快得多，阿里开发规范中要求拼接不能使用+符号
        // StringBuilder 线程不安全
        StringBuilder sb = new StringBuilder();
        sb.append("我创建了");
        sb.append(1);
        sb.append('个');
        sb.append(new T());
        // 我创建了1个com.ithm.day08.T@b4c966a
    }
}

class T{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
