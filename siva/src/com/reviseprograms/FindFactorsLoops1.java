package com.reviseprograms;

//WAP to print given number factors and its count..?
import java.util.Scanner;

public class FindFactorsLoops1 {

	static void findFactors(int a) {
		int count=0;
		for (int j = 1; j <= a; j++) {
			if (a % j == 0) {
				System.out.println(j+ "");
				count++;
			}
			System.out.println("factors count:"+count);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = sc.nextInt();
		findFactors(a);
	}

}
