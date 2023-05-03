package com.itpw.day07.interface_learn.addition;

import java.util.List;

public interface StudentOperator {
    /***
     * 打印全部学生信息
     * @param studentList
     */
    void PrintStudentInfo(List<Student> studentList);

    /***
     * 打印学生平均分
     * @param studentList
     */
    void PrintStudentAvgScore(List<Student> studentList);
}
