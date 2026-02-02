package com.arrays;

// Using scanner class to represent a given array..?
import java.util.Scanner;

public class TestArrDemo6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a size of array:");
		String[] arrname = new String[4];
        System.out.println("enter a values on int ");
		int[] arr = new int[3];

		// Reading the elements from the scanner
		System.out.println("enter the value based on size:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arrname.length; i++) {
			arrname[i] = sc.nextLine();
		}

		// representing the Array values..
		System.out.println("representing the Array values:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		
		for (int i = 0; i < arrname.length; i++) {
			System.out.println(arrname[i]);
		}

	}
}
