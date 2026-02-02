package com.arrays;

//WAP to print given array elements each digit will reverse in output ..?
//ex: input:{121,551,967,123}
//    output:{121,155,769,321}
public class TaskArrReverseDigits {
	static int arrReverseDigits(int numbers) {
		int rev = 0;
		int r = 0;
		while (numbers != 0) {
			r = numbers % 10;
			rev = rev * 10 + r;
			numbers = numbers / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] numbers = { 121, 551, 967, 123 };
		for (int i1 : numbers) {

		System.out.print(arrReverseDigits(i1) + " ");
		}
	}
}
