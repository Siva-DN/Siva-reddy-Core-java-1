package com.arrays;

//WAP to print minimum index or minimum to maximum replace values using with array selection sort..?
public class TestArrSelectionSort2 {

	public static void main(String[] args) {

		int[] arrnum = { 50, 40, 30, 5, 60, 20 };
		int temp = 0;

		for (int i = 0; i < arrnum.length; i++) {
			int min = i;

			for (int j = i + 1; j < arrnum.length; j++) {
				if (arrnum[j] < arrnum[min]) {
					min = j;

				}

			}
			temp = arrnum[i];
			arrnum[i] = arrnum[min];
			arrnum[min] = temp;

		}
		for (int arr : arrnum) {
			System.out.print(arr + " ");

		}
		System.out.println();

	}

}
