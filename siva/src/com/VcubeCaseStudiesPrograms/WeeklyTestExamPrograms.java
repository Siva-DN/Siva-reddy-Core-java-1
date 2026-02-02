package com.VcubeCaseStudiesPrograms;

import java.util.Scanner;

public class WeeklyTestExamPrograms {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner Sc = new Scanner(System.in);

	}

	public class snipplet {

//		static int check() {
//			return 5;
//		}
		public static void main(String[] args) {
//1)	for(int i=0;i<5;(i+1)++) { }//error opreator wrong 
//2)	for	(boolean b=true;b;b++) {} // type mismatch error cannot convert boolean to int type

//3)	for(int i=0;check();i++) {} // type mismatch error cannot convert boolean to int type

//4)	for(int i=1;i<5;i++) {
//		int x=(i%2==0?i:"hello");// type mismatch error cannot convert string into INT type
//		}

			for (int i = 1; i <= 10; i++) {
				String result = (i % 3 == 0 ? "Divisible by 3" : i % 2 == 0 ? "Even" : "odd");
				System.out.println(i + "->" + result);
			}
		}
	}
}
