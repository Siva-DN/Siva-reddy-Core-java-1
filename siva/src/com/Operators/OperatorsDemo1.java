package com.Operators;

import java.util.Scanner;

//operators example....
//Arithmetic operators ---> +,-,*,/,%..?

public class OperatorsDemo1 {
	
	
	public static void main(String[] args) {
		System.out.println("main methosd started");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		
		//BODMAS rule
		System.out.println("Addition:"+a+b);
		System.out.println("Addition:"+(a+b));
		
		
		//The operator - is undefined for the argument type(s) String, int
//		System.out.println("Addition:"+a-b);
		System.out.println("subration:"+(a-b));
		
		
		System.out.println("multiple:"+a*b);
		
		System.out.println("Addition:"+(a/b));
		
		System.out.println("Addition:"+(a&b));
		
		
		
	}

}
