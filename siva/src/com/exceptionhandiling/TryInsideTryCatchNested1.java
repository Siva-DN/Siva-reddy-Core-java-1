package com.exceptionhandiling;

//Nested try catches will possible in the below..

public class TryInsideTryCatchNested1 {

	public static void main(String[] args) {
		System.out.println("main method Stsrted !!");

		try {
			System.out.println("In try1 !!");
			try {
				System.out.println("In try2 !!");
				System.out.println(10 / 0);
			} catch (Exception e2) {
				System.err.println("In catch2 !!");
			} finally {
				System.out.println("In Finally2 !!");

			}
			System.out.println(10 / 0);
			System.out.println("Hello GoodEvening !!!!");
		} catch (Exception e1) {
			System.err.println("In catch1 !!");
			try {
				System.out.println("In try3 !!");
			} catch (Exception e3) {
				System.err.println("In catch3 !!");
			} finally {
				System.out.println("In Finally3 !!");
			}

		}

		System.out.println("main method ended !!");

	}

}
