package com.ithm.stumanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        Admin admin = new Admin();
        while (!(username.equals(admin.getUsername()) && password.equals(admin.getPassword()))) {
            System.out.println("用户名或者密码有误，请重新输入:");
            System.out.println("请输入用户名:");
            username = sc.next();
            System.out.println("请输入密码:");
            password = sc.next();
        }
        boolean flag = true;
        // 这里新建一个stuList而不去Admin类新建的话是不对的，不符合开发逻辑
        // 因为所有的类都要找到他们的归属，而学生类就是归属在管理员下的
        // List<Student> stuList = new ArrayList<>();
        while (flag) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("添加学生");
                    // 思考一下1.为什么方法定义在Admin类 2.为什么添加学生是实例方法？
                    // 1.想象一下：添加学生是管理员的权限，只有管理员可以添加,所以要放在管理员类下。
                    // 2.那为什么是实例方法？
                    //   如果是静态方法，那么管理员类下无法访问到自身的实例属性
                    //   比如addStu()方法中需要访问到自身所在类下的学生集合属性
                    //   如果使用静态方法，那么必须要在addStu()方法中new Admin 才能访问到集合属性
                    //   结果你在StaticAddStu方法中new了一个Admin类去访问集合，那么不同两个集合引用
                    //   存在于不同的对象，会导致你的add方法实效
                    //   分析可以见JVM内存图
//                    admin.addStu();

                    // 调用此静态方法就会add失效，从内存图分析能得出原因
                    Admin.StaticAddStu();
                    break;
                }
                case 2: {
                    System.out.println("删除");
                    admin.delStu();
                    break;
                }
                case 3: {
                    System.out.println("修改");
                    admin.updateStu();
                    break;
                }
                case 4: {
                    System.out.println("查看");
                    admin.showStu();
                    break;
                }
                case 5: {
                    System.out.println("退出");
                    flag = false;
                    break;
                }
                default:
                    System.out.println("请输入正确的选择");
                    choice = sc.nextInt();
                    break;
            }
        }

    }
}

