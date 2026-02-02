package com.exceptionhandiling;


// Why try with multiple catches...? Dependency code will occurs

//A)Whenever the second part of the code is depending on the first  part of the code 
// then keep all that code inside the Try block then thats why introduced try with multiple catches.

//

import java.util.Scanner;

public class WhyTryWithMultipleCatches2 {

	public static void main(String[] args) {
		System.out.println("main method Started !!!");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("In try");
			System.out.println("enter a value:");
			int a = sc.nextInt();//
			int b = 10 / a;
			String s = "java";
			System.out.println(s.charAt(b));
		} catch (ArithmeticException ar) {
			System.out.println("In catch Ar!!");
			ar.printStackTrace();
		} catch (NullPointerException np) {
			System.out.println("In catch Np !!");
			np.printStackTrace();
		} catch (Exception e) {
			System.out.println("In catch Expection !!");
			e.printStackTrace();
		}
	}

}
