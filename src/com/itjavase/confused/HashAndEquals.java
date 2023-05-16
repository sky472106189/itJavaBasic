package com.itjavase.confused;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 如果重写hashCode方法,集合里面的对象属性被修改后。hash值是会改变的。remove就会失败，造成内存泄漏
* 如果没有重写hashCode方法，集合里面的对象属性被修改后。hash值是不会改变的。remove就会成功，不会造成内存泄漏。
* tips:问题的关键就是变量修改导致hashCode返回值也修改，使删除失败了。
*      那么日常开发中，如果hashCode中某个参数会在未来被修改，那么就不要用这个值参与hashCode函数即可
*      比如本例就是因为name属性修改，而name又参与了hashCode所以删除失败了。
*      那么我们只需要修改hashCode函数，只让id参与hashCode函数即可
* */
public class HashAndEquals {
    public static void main(String[] args) {
        Person p1 = new Person(1,"张三");
        Person p2 = new Person(2,"李四");

        Set<Person> set = new HashSet<>();
        System.out.println("p1的hash="+p1.hashCode());    //775881
        System.out.println("p2的hash="+p2.hashCode());    //843084
        set.add(p1);
        set.add(p2);

        p1.name = "王五";
        System.out.println("修改p1名字为王五后——————————————————————");
        //由于hashcode重写不当导致hash值775881->938057改变了,那么调用remove就会删除失败
        //因为此时remove会去938057找,发现是空的就不会删除。但是实际上p1位置还在775881
        //如果未重写hashcode方法那么hash值不会改变会删除成功
        System.out.println("p1的hash="+p1.hashCode());
        System.out.println("p2的hash="+p2.hashCode());   //843084
        set.remove(p1);
        set.add(new Person(1,"王五"));
        for (Person p : set) {
            System.out.println(p);
        }
    }
}

class Person{
    public int id;
    public String name;

    @Override
    public int hashCode() {
        //id 和 name 一起hash会导致remove实效
//        return Objects.hash(id, name);
        return Objects.hash(id);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
