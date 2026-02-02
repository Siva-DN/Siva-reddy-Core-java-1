package com.arrays;

//WAP to find the max and min value in the array..?
public class TestArrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 101, 102, 103, -101, -100 };

		int max = arr[0];
		int min = arr[0];

//		for (int n : arr) {
//			if (n > max) {
//				max = n;
//
//			} else if (n < min) {
//				min = n;
//			}
//
//		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			} else if (arr[i] < min) {
				min=arr[i];
			}
		}

		System.out.println("max number:" + max);
		System.out.println("min number:" + min);

	}

}
