package com.reviseprograms;
// Selection sort using arrays..?
public class TestArrSeclectionsort1 {

	public static void main(String[] args) {
		System.out.println("main method stareted");

		int[] arr = { 40, 50, 60, 30, 10, 5 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			System.out.println("After rotation or checking..");
			System.out.println(arr[i] + " ");
		}

	}

}
