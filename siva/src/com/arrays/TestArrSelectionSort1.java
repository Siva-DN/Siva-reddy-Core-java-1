package com.arrays;

//WAP to print minimum index or min to max replace values using with array selection sort..?
public class TestArrSelectionSort1 {

	public static void main(String[] args) {

		int[] arrnum = { 40, 50, 30, 10, 5 };
		int temp = 0;

		for (int i = 0; i < arrnum.length; i++) {
			int min = i;// 0
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
			System.out.println(arr + " ");
		}
		System.out.println();
	}

}
