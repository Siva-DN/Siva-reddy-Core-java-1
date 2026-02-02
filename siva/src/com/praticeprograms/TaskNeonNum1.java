package com.praticeprograms;

//WAP to find given number is Ne-on number or not..?
//ex:input:a=9 a=a*a=81, a=81-->8+1=9
//output:9 is neon number.!!
import java.util.Scanner;

public class TaskNeonNum1 {

	static void findNeonNum(int a) {
		int square = a * a;
		int sum = 0;
		while (square != 0) {
			int r = square % 10;//81%10--r=1
			sum = sum + r;
			square = square / 10;
		}
		if (sum == a) {
			System.out.println("is neon number:" + a);
		} else {
			System.out.println("is not a neon number:" + a);
		}

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();

		findNeonNum(a);
	}

}
