package com.arrays;

public class TestArrayDemo2 {

	public static void main(String[] args) {
		System.out.println("main main method started");

		// Declaration
		int[] numbers = { 101, 102, 103, 104, 105 };
//		java.lang.ArrayIndexOutOfBoundsException 
//		Index 5 out of bounds for length 5
//		for (int i = 0; i <= numbers.length; i++) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		//Reverse the elements in the given array 
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
//      for each loop or enhanced loop.
		for (int n : numbers) {
			System.out.println(n);
		}

	}

}
