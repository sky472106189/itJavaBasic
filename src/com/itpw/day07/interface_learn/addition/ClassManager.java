package com.itpw.day07.interface_learn.addition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/***
 * 班级管理系统
 */
public class ClassManager {
    // 这样写会导致什么问题? 答:两个引用类型的实例变量，初值都是null，后面的操作都会引发NOP
//    private List<Student> studentList;
//    private StudentOperator studentOperator;

    // 一定要new对象，可以在这,也可以在构造方法
    // 可以在静态代码块吗？不行，因为静态代码块需要对静态属性操作。如果是静态属性，那所有的班级管理都只能操作一个班级了
    // 可以在实例代码块吗？大部分是可行的，其中实例代码块发生在构造方法之前，且还是需要new
    // 具体用哪一种，根据不同的场景使用即可。
    private List<Student> studentList = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl1();

    public ClassManager() {
        studentList.add(new Student("小明",Sex.MAN,new Random().nextInt(101)));
        studentList.add(new Student("小红",Sex.WOMAN,new Random().nextInt(101)));
        studentList.add(new Student("小蓝",Sex.WOMAN,new Random().nextInt(101)));
        studentList.add(new Student("小刚",Sex.MAN,new Random().nextInt(101)));
        studentList.add(new Student("大雄",Sex.MAN,new Random().nextInt(101)));
        studentList.add(new Student("哆啦A梦",Sex.UNKNOWN,new Random().nextInt(101)));
        studentList.add(new Student("柯南",Sex.UNKNOWN,new Random().nextInt(101)));
    }

    /***
     * 打印全部学生信息
     */
    public void printStudentInfo(){
        studentOperator.PrintStudentAvgScore(studentList);
    }

    /***
     * 打印全校平均分
     */
    public void printStudentAvgScore(){
        studentOperator.PrintStudentAvgScore(studentList);
    }
}
