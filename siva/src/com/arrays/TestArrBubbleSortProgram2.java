package com.arrays;

//WAP to Given array using Bubble-sort..?
public class TestArrBubbleSortProgram2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 40, 50, 60, 30, 20, 10, 5 };
		int temp = 0;

		System.out.println("before sorting");
		for (int arr1 : arr) {
			System.out.println(arr1 + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for (int arr1 : arr) {
			System.out.print(arr1 + " ");
		}
		System.out.println();
	}
}
