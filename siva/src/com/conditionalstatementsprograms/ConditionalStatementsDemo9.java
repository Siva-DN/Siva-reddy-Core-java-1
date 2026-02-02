package com.conditionalstatementsprograms;

//given number is perfect or not with using for loop and input from scanner..?
import java.util.Scanner;

public class ConditionalStatementsDemo9 {

	static boolean isPerfect(int k) {
		int sum = 0;
		boolean status = false;
		for (int j = 1; j <= k / 2; j++) {
			if (k % j == 0) {
				sum = sum + j;
			}
			if (sum == k) {
				status = true;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int k=sc.nextInt();
		boolean isPerfect=isPerfect(k);
		
		if(isPerfect) {
			System.out.println("is perfect number:");
		}else {
			System.out.println("is not a perfect");
		}
	}

}
