package com.arrays;

//WAP to using arrays with Bubble sorting with given array elements...?
//Example: input :  int[] arr={40,50,30,20,5,10};
//         output: {5,10,20,30,40,50};

public class TestArrBubbleSortProgram1 {

	public static void main(String[] args) {

		// declaration and initialization array
		int[] arrnum = { 40, 50, 30, 20, 5, 10 };

		System.out.println("Before sorting ..!!!!!");
		int temp = 0;
		for (int num : arrnum) {
			System.out.println(num + " ");
		}
		// First for loop for values rotation
		// Second for loop for checking and indexes elements in the array swapping.
		for (int i = 0; i < arrnum.length; i++) {
			for (int j = 0; j < arrnum.length - 1 - i; j++) {

				if (arrnum[j] > arrnum[j + 1]) {
					temp = arrnum[j];
					arrnum[j] = arrnum[j + 1];
					arrnum[j + 1] = temp;
				}
			}

		}
		System.out.println("After sorting!!!!!");
		for (int num : arrnum) {
			System.out.println(num + " ");

		}
		System.out.println();

	}
}
