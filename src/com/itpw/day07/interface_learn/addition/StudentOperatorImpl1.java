package com.itpw.day07.interface_learn.addition;

import java.util.List;

/***
 * 学生操作实现
 */
public class StudentOperatorImpl1 implements StudentOperator{

    /***
     * 打印全部学生信息
     * @param studentList
     */
    @Override
    public void PrintStudentInfo(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    /***
     * 打印所有学生平均分
     * @param studentList
     */
    @Override
    public void PrintStudentAvgScore(List<Student> studentList) {
        double avgScore = 0.0;
        for (Student student : studentList) {
            avgScore +=student.getScore();
        }
        // 平均分
        avgScore /=studentList.size();
        // 保留两位小数
        String  str = String.format("%.2f",avgScore);
        double res = Double.parseDouble(str);
        System.out.println("全校平均分="+res);;
    }
}
