package com.praticeprograms;

//WAP to print Even and odd numbers using Array..?
public class TaskArrayEvenorOdd {

	public static void main(String[] args) {
		System.out.println("main method Started");

		int[] num = { 2, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + "even numbers");
			} else {
				System.out.println("odd number" + num[i]);
			}

		}

	}

}
