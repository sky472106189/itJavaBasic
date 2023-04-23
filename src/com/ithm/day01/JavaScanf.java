package com.ithm.day01;
import java.util.Scanner;

/**
 * 输入语句
 * */
public class JavaScanf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int num = sc.nextInt();
		while(num!=99){
			System.out.println(num);
			System.out.println("请输入一个数字");
			num = sc.nextInt();
		}
	}
}