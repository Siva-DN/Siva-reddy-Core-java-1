package com.arrays;

//WAP to find the leader of the given array..?
public class TaskArrLeadNum1 {

	public static void main(String[] args) {
		System.out.println("main method Stated");

		int[] arr = { 16, 17, 4, 3, 5 };

		for (int i = 0; i < arr.length; i++) {
			boolean b = true;

			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					b = false;
				}
			}
			if (b) {
				System.out.print(arr[i] + " ");
			}

		}

	}

}
