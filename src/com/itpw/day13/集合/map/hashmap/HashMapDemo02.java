package com.itpw.day13.集合.map.hashmap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
    1、向Map集合中存,以及从Map集合中取,都是先调用key的hashCode()方法,然后再调用equals()方法!
        1.1、什么时候equals()方法被调用，说明同一链表上key的hashCode()后的hash值必然相同
        1.2、什么时候equals()不会调用?用put(k,v)方法举例,
            k.hashCode()方法返回hash值.
            hash值经过&位运算转换成数组下标
            数组下标位置上如果是null,equals()不会调用.

    2、注意:如果一个类的equals()重写了,那么hashCode()方法必须重写.
        并且equals()方法返回true,hashCode()返回的值必须一样.
        解释:equals()方法返回true,表示两个对象相同,在同一个单向链表上比较.
            那么对于同一个单向链表上的节点来说,他们的哈希值都是相同的.
            所以hashCode()方法的返回值也必须相同.

    3、hashCode()方法和equals()方法不用研究,可以直接用IDEA工具生成,但是这两个方法要同时生成!

    总结:
            HashMap会先用key执行hashCode()生成的的hash值，再对hash值进行&位运算，
        检查table位置，如果这个位置没有值就放入，如果有值，就用equals()分别比较key
        如果相等就替换该value 值。如果不等就放在链表的末尾，并将next指针null。
    补充：如果单一链表下的长度超过8，那么链表会转化为红黑树，如果成树后，节点数少于6
    就会退化成链表

    红黑树口诀:左根右，根叶黑，不红红，黑路同
*/

public class HashMapDemo02 {
    public static void main(String[] args) {
        Student s1 = new Student("张三");
        Student s2 = new Student("张三");
        System.out.println(s1.equals(s2));//重写之前是false,重写之后是true

        System.out.println("s1的哈希值"+s1.hashCode());//s1的哈希值21685669 重写之后s1的哈希值774920
        System.out.println("s2的哈希值"+s2.hashCode());//s2的哈希值2133927002 重写之后s2的哈希值774920

        //s1.equals(s2)结果已经是true了,表示s1和s2是一样的,相同的.那么往HashSet集合中放的话
        //按说只能放进去一个.(HashSet:有序不可重复)
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());//2 但是这个结果按说是1

        //原因是因为没有重写hashCode()方法,里面存的是s1和s2的内存地址,而s1和s2的内存地址不同,
        //于是不同的内存地址调用hashCode()后，结果不同，put方法底层就会得到不同的数组下标
        //解决方法就是针对Student里面的name来写hashCode()
    }
}
class Student{
    private String name;

    public int hashCode(){
        return Objects.hash(name);
    }

    //equals:如果学生名字一样,表示同一个学生.
    public boolean equals(Object obj){
        if(obj==null|| !(obj instanceof Student)) return false;
        if(obj==this) return true;
        Student s = (Student)obj;
        return this.name.equals(s.name);
    }
    public Student() {
    }

    public Student(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}