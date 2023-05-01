package com.itpw.day09.homework.酒店管理;

import java.util.Scanner;

/**
 * 为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能
 * 1、该系统的用户是：酒店前台。
 * 2、酒店中所有的房间使用一个二维数组来模拟
 * 3、酒店中的每一个房间应该是一个java对象：Room
 * 4、Room应该有：房间编号，房间类型，房间是否空闲
 * 5、系统对外提供的功能：
 * 可以预定房间：用户输入房间编号，订房
 * 可以退房：用户输入房间编号，退房
 * 可以查看所有房间的状态：用户输入某个指令可以查看所有房间状态
 */
public class Test02 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(new Room[3][10]);
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("--------欢迎来到酒店管理系统--------");
            System.out.println("1 查看所有房间");
            System.out.println("2 根据房间号预定房间");
            System.out.println("3 根据房间号退房");
            System.out.println("0 退出");
            System.out.println("请输入您的选择:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2: {
                    System.out.println("请输入一个房间号");
                    hotel.hotelReserve(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("请输入一个房间号");
                    hotel.quitRooms(sc.nextInt());
                    break;
                }
                case 0: {
                    flag = false;
                    break;
                }
                default: {
                    System.out.println("请输入正确的操作序号");
                    break;
                }
            }
        }
    }
}
