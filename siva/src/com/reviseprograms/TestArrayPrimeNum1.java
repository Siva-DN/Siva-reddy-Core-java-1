package com.reviseprograms;

import java.util.Scanner;

//WAP to print prime numbers using scanner and arrays..?
public class TestArrayPrimeNum1 {

	public static void main(String[] args) {
		System.out.println("main method staretd");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the arry size:");
		int size = sc.nextInt();// 10
		int[] arr = new int[size];

		System.out.println("Enter the values based on above size:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();// 0 1 2 3 4 5 6 7 8 9
		}

		System.out.println("Array representation..!!!!!");

		for (int i = 0; i < size; i++) {
			boolean status = true;

			if (arr[i] == 0 || arr[i] == 1) {
				status = false;
			}

			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				System.out.println(arr[i] + " ");//2 3 5 7 9....
			}
		}

	}

}
