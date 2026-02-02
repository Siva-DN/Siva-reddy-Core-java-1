package com.conditionalstatementsprograms;

//for loop conditional statements Intro..?
import java.util.Scanner;

public class ConditionalStatementsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method strated");
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 4; i++) {
//			int abc =sc.nextInt();
			System.out.println("hello welcome to for loop !!");
			System.out.println("good to go for conditional statements");
			Thread.sleep(1000);
		}
		for (int j = 1; j < 4; j = j + 1) {
//			int abc =sc.nextInt();
			System.out.println(j+"hii welcome to for loops !!");
		}

		for (int k = 100; k > 4; k--) {
//			int abc =sc.nextInt();
			System.out.print(k+" ");
			
		}
	}

}
