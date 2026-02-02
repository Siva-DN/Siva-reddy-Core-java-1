package com.arrays;

// WAP to find missing number from an given array..? 
public class TaskArrMIssingNum2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] num = { 101, 102, 103, 105 };
		for (int i = 0; i < num.length; i++) {

			int start = num[i];
			int end = num[i + 1];
			
			for (int j = start+1; j < end; j++) {

			}
			System.out.print(num[i] + " ");

		}
	}

}
