package com.exceptionhandiling;

public class TaskException1 {

	static void method1() {
		System.out.println("method1 started !!");
		try {
			method2();

		} finally {
			System.out.println("method1 finally ");

		}

	}

	static void method2() {
		System.out.println("method2 started !!");
		try {
			method3();

		} finally {
			System.out.println("method2 finally ");
			

		}

	}

	static void method3() {
		System.out.println("method3 started !!");
		try {
			System.out.println(10 / 0);

		} finally {
			System.out.println("method3 finally ");

		}

	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		try {
			System.out.println("in try main method  !!");
			method1();

		} catch (Exception e) {
			System.out.println("main method exception !!");
			e.printStackTrace();
		}

	}

}
