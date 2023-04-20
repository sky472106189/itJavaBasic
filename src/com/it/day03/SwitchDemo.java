package com.it.day03;

import java.util.Scanner;

/**
 * switch分支
 *  支持byte/short/char/int
 *  String/enum
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入周几");
        String str = sc.next();
        String res;
        switch (str) {
            //最好每一个case都加break 防止case穿透
            //穿透即从case入口处一直往下，直到遇到break/return
            case "周一":
                res = "跑步";
                break;
            case "周二":
                res = "游泳";
                break;
            case "周三":
                res = "慢走";
                break;
            case "周四":
                res = "动感单车";
                break;
            case "周五":
                res = "拳击";
                break;
            case "周六":
                res = "爬山";
                break;
            case "周日":
                res = "好好吃一顿";
                break;
            // default 必须存在，即使什么都不写
            default:
                res = "休息";
                break;
        }
        System.out.println(res);
    }
}
