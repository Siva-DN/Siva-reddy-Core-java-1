package com.praticeprograms;

//WAP to find the Repeated values count in given number of elements..? 
public class TaskArrayRepeatedVAlues {

	public static void main(String[] args) {
		System.out.println("main method Started");
		int count = 0;
		int r = 0;
		int[] numbers = { 122, 222, 321, 782 };
		for (int i = 0; i < numbers.length; i++) {
			while (numbers[i] != 0) {
				r = numbers[i] % 10;

				numbers[i] = numbers[i] / 10;
				if (r == 2)
					count++;
			}
		}
		System.out.println(count);

	}
}