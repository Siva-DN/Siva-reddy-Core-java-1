package com.arrays;

// WAP to print prime numbers using arrays with scanner method..?
import java.util.Scanner;

public class TestArrDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size:");
		int size = sc.nextInt();

		int[] arrnum = new int[size];
		System.out.println("enter the array values");
		for (int i = 0; i < size; i++) {
			arrnum[i] = sc.nextInt();
		}
		System.out.println("******Array representation***");
		for (int i = 0; i < size; i++) {
			boolean status = true;

			if (arrnum[i] == 0 || arrnum[i] == 1) {
				status = false;
			}

			for (int j = 2; j < arrnum[i]; j++) {
				if (arrnum[i] % j == 0) {
					status = false;
					break;
				}

			}
			if (status) {
				System.out.print(arrnum[i]+" ");
			}

		}

	}

}
