package com.praticeprograms;
//Armstrong number  
import java.util.Scanner;

public class TaskLoopsArmstrongNumNum5 {

	static boolean findArmstrong(int a) {
		boolean status = false;
		double sum = 0;
		int r = 0;
		int temp = a;

		while (a != 0) {
			r = r % 10;
			sum = (int) sum + Math.pow(r, sum);
			a = a / 10;
		}
		return status=true;
	}

	public static void main(String[] args) {
		System.out.println("amin method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a = sc.nextInt();
		boolean flag = findArmstrong(a);

		if (flag) {
			System.out.println(flag + ": is Armstrong number");
		} else {
			System.out.println(flag + ": is not a Armstrong number");
		}
	}

}
