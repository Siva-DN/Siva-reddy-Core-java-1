package com.conditionalstatementsprograms;

//WAP to swap the two numbers without using a third variable..?
public class TaskSwap1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 5;
		int b = 10;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a+ " a value");
		System.out.println(b+ " b value");
	}

}
