package com.dsaconcepts1;

import java.util.Scanner;

public class TestDsaLinearScarch1 {
	static int search(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 101, 20, 40, 50, 70, 100 };
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		System.out.println("key index is :" + search(arr, key));
		sc.close();
	}

}
