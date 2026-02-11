package com.exceptionhandiling;

public class TestExamException1 {

	public static void main(String[] args) {

		System.out.println("main method Started");
		TestExamException1 t1 = new TestExamException1();
		System.out.println(t1);

		String s = new String("Hii good morning !!");
		System.out.println(s);

		String s1 = new String("Hii good morning !!");
		System.out.println(s1);

		try {
			try {
				throw new Exception("Inner Exception");
			} finally {
				System.out.println("Inner family");
				throw new RuntimeException("Finally Exception");
			}

		} catch (Exception e) {
			System.out.println("caught:" + e.getMessage());
		}

	}

}
