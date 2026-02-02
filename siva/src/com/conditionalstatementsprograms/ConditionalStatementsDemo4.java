package com.conditionalstatementsprograms;

//Write a program to print math table using for loop..?
//like 9 * 1 =9;
//9 *2 =18 ...Up-to
//9 *10 =90
import java.util.Scanner;

public class ConditionalStatementsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");

		int a = sc.nextInt();// 9

//		System.out.println("enter a number for up-to representing");
//		int s = sc.nextInt();// 10
//
//		for (int j = 1; j <= s; j++) {
//			System.out.println(a + " X " + j + " = " + a * j);
//		}
//		
//
//		for (int i = 1; i <= a; i++) {
		////			if (i % a == 0) {
//				System.out.println(a + "X "+i+" ="+i*a);
		////			}
//		}
		int i = 1;
		while (a >= i) {
			System.out.println(a + "x" + i + "=" + a * i);
			i++;
		}
	}

}
