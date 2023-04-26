package com.ithm.day09;

import java.util.ArrayList;
import java.util.List;

/*
 * 删除集合中含"test"的元素
 * */
public class ListDemo02 {
    public static void main(String[] args) {
        List<T> list = new ArrayList<>();

        list.add(new T("test"));
        list.add(new T("张三"));
        list.add(new T("李四"));
        list.add(new T("test"));
        list.add(new T("test"));
        /*
        // 不推荐的方法
        // 注意要逆向删,因为remove执行后 集合会整体往前移
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).name == "test") {
                list.remove(i);
            }
        }*/

        // 更好的方法，实际开发用的
        list.removeIf(s->s.name.contains("A"));
        System.out.println(list);

        for (T param : list) {
            System.out.println(param);
        }
    }
}

class T {
    public String name;

    public T(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "T{" +
                "name='" + name + '\'' +
                '}';
    }
}
