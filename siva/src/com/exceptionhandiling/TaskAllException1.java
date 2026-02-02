package com.exceptionhandiling;

// All Exception in one program like ArithmeticException,NullPointer,ArrayIndexOutBound,InputMismatch...
// using multiple try catch blocks ...?
import java.util.Scanner;

public class TaskAllException1 {

	public static void main(String[] args) {
		System.out.println("main mmethod started !!");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		;

		try {
			System.out.println("In Try1 !!!");
			System.out.println("enter a value :");
			int a = sc.nextInt();
			System.out.println(a / 0);
			try {
				System.out.println("In try2 !!");

			} catch (ArithmeticException e) {
				System.out.println("in catch2 !!");
			}
		} catch (Exception e1) {
			System.out.println("In catch1 !!");
			e1.printStackTrace();

			try {
				System.out.println("In try3 !!");
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
				arr[3] = 40;

			} catch (ArithmeticException e) {
				System.out.println("in catch3 !!");

			} finally {
				System.out.println("in finally 1");
				try {
					System.out.println("In try4 !!");
					String s = null;
					System.out.println(s.length());

				} catch (NullPointerException e2) {
					System.out.println("in catch4 !!");
					e2.printStackTrace();
				}

			}
		}
	}
}