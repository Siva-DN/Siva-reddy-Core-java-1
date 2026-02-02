package com.exceptionhandiling;

//finally block will execute always except System.exit(0);
public class TryCatchFinallyCombo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		try {
			System.out.println("In try !!");
			System.exit(0);
			return;
		} catch (Exception e) {
			System.out.println("In catch !!");
		} finally {
			System.out.println("In Finally !!");
		}
		try {
			System.out.println("In try2 !!");

		} catch (Exception e1) {
			System.out.println("In catch2");
			e1.printStackTrace();
		}
		System.out.println("main method ended !!");

	}

}
