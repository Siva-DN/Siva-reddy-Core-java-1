package com.reviseprograms;

//Even odd program print 1 to 100 numbers..?
import java.util.Scanner;

public class LoopsEvenOdd {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 100; i = i + 2) {
			System.out.print("even numbers:" + i);
		}

		for (int j = 0; j <= 100; j++) {
			if (j % 2 == 1) {
				System.out.print("odd numbers:" + j);
			}
		}
	}

}
