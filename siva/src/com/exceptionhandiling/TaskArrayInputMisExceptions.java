package com.exceptionhandiling;

import java.util.Scanner;

public class TaskArrayInputMisExceptions {

	public static void main(String[] args) {
		System.out.println("main method Stated !!");

		Scanner sc = new Scanner(System.in);
		int array[] = new int[3];

		try {
			array[0] = 101;
			array[1] = 102;
			array[2] = 103;
//			array[3] = 104;

			System.out.println("enter a number:");
			int a = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

			System.out.println("main  method Ended");
		}

	}
}
