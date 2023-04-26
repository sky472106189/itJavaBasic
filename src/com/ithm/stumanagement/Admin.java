package com.ithm.stumanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 管理员类
 */
public class Admin {
    // 用户名
    private String username = "admin";
    // 密码
    private String password = "admin";

    private List<Student> studentList = new ArrayList<>();

    /***
     * (实例方法)添加学生对象进studentList集合
     */
    public void addStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入学号");
        String id = sc.next();
        System.out.println("请输入生日:格式YYYY-MM-DD");
        String birthday = sc.next();

        // 为什么能执行，因为studentList.add()前面省略了一个this.
        // 相当于当前引用调用add方法 即【引用.】的方式
        studentList.add(new Student(id, name, age, birthday));

        // 这个方法编译能通过，但是方法压栈后，每次执行此方法都要new Admin对象
        // 导致每一个栈帧存在一个Admin对象，这样多一个方法就多一个不同的Admin对象
        // 并没有指向一个Admin，所以新增也会失效
        //new Admin().studentList.add(new Student(id, name, age, birthday));
    }

    /***
     * (静态方法)添加学生对象进studentList集合
     * 补充:这个是有问题的，这个添加会导致数据不具有持久性，即添加实效
     * 具体原因可以看内存分析图
     */
    public static void StaticAddStu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入学号");
        String id = sc.next();
        System.out.println("请输入生日:格式YYYY-MM-DD");
        String birthday = sc.next();
        // 为什么编译报错？ 因为 studentList.add前面默认隐含了this.
        // 而this是不能存在静态中的
        // 更深的思考方式:静态方法是属于类的，在类加载的时候就会分配内存，
        // 可以通过类名直接访问。而studentList()是实例对象，在类加载时并没有分配内存，故编译找不到该对象，报错
        // 而实例对象，只有在实例化之后才存在
        //studentList.add(new Student(id, name, age, birthday));

        // 静态方法要访问实例变量必须要new才行
        new Admin().studentList.add(new Student(id, name, age, birthday));
    }

    /***
     * 展示学生
     */
    public void showStu() {
        for (Student stu : studentList) {
            System.out.println(stu);
        }
    }

    /***
     * 按学号删除学生
     */
    public void delStu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想删除的学生的号码");
        String id = sc.next();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if(id.equals(student.getId())){
                studentList.remove(i);
            }
        }
    }

    /***
     * 修改学生信息
     */
    public void updateStu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想更新学生的号码");
        String id = sc.next();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if(id.equals(student.getId())){
                System.out.println("请输入姓名");
                String name = sc.next();
                System.out.println("请输入年龄");
                int age = sc.nextInt();
                System.out.println("请输入生日:格式YYYY-MM-DD");
                String birthday = sc.next();

                // 这种修改方法会不成功
                // 分析可以看内存图
                //student = new Student(id,name,age,birthday);

                student.setBirthday(birthday);
                student.setAge(age);
                student.setName(name);

            }
        }
    }

    // 没必要使用set方法,因为需求中要求管理员账号密码不可更改
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
