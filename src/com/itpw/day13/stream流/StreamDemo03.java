package com.itpw.day13.stream流;

import com.itpw.day08.访问控制权限.modify01.F;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 19, 62D);
        Student s2 = new Student("李四", 23, 78D);
        Student s3 = new Student("王五", 18, 56D);
        Student s4 = new Student("小赞", 5, 90D);
        Student s5 = new Student("小明", 45, 100D);

        List<Student> stuList = new ArrayList<>();
        Collections.addAll(stuList, s1, s2, s3, s4, s5);

        // 1、找出成绩大于等于60分的数据，并按成绩升序排序，再输出
        // stream流支持forEach
        stuList.stream()
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getScore() >= 60;
                    }
                })
                .sorted(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return Double.compare(o1.getScore(), o2.getScore());
                    }
                })
                .forEach(new Consumer<Student>() {
                    @Override
                    public void accept(Student student) {
                        System.out.println(student);
                    }
                });
        // 使用Lambda优化
        stuList.stream()
                .filter(stu1 -> stu1.getScore() >= 60)
                .sorted((o1, o2) -> Double.compare(o1.getScore(), o2.getScore()))
                .forEach(stu -> System.out.println(stu));

        System.out.println("——————————————————————————");

        // 2、找出年龄介于15至30之间，并按照年龄降低输出
        stuList.stream()
                .filter(o1 -> o1.getAge() >= 15 && o1.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(o1 -> System.out.println(o1));

        System.out.println("——————————————————————————");

        // 3、取出成绩前三的学生，并输出
        stuList.stream()
                .sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()))
                .limit(3)
                .forEach(student -> System.out.println(student));

        System.out.println("——————————————————————————");

        // 4、取出分数倒数二名的学生，并输出
        stuList.stream()
                .sorted((o1, o2) -> Double.compare(o2.getScore(), o1.getScore()))
                .skip(stuList.size()-2)
                .forEach(student -> System.out.println(student));

        System.out.println("——————————————————————————");

        // 5、找出分数>=50的学生名字，并且去除重复的名字，再输出
        stuList.add(new Student("哆啦A梦", 42, 150));
        stuList.add(new Student("哆啦A梦", 32, 123D));
        stuList.stream()
                .filter(o1->o1.getScore()>=50)
                .map(o1 -> o1.getName()) //map变Name单独抽离出来，由于name是String类型，天然重写了hashCode和equals方法
                .distinct() //distinct去重,自定义类(希望内容一样,就重写hashCode,equals)
                .forEach(o1-> System.out.println(o1));

        System.out.println("——————————————————————————");

        // 补充:使用concat连接两个流
        Stream<String> stream1 = Stream.of("张三", "李四");
        Stream<String> stream2 = Stream.of("王五", "老六");
        Stream<String> result = Stream.concat(stream1, stream2);
        result.forEach(System.out::println);

        // 补充二:stream流中的map方法
        // 可以理解成将集合中的数据，单独抽离出来
        Stream<String> stringVar = stuList.stream()
                .map(o1 -> o1.getName());   // name是String类型
        Stream<Double> doubleVar = stuList.stream()
                .map(o1 -> o1.getScore());  // Score是Double类型

    }
}

class Student {
    private String name;
    private int age;
    private double score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
