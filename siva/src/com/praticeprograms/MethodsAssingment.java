package com.praticeprograms;

import java.util.Scanner;

public class MethodsAssingment {
	static Scanner sc = new Scanner(System.in);
	int result;
	public static void main(String[] args) {
		System.out.println("main method started");
		MethodsAssingment m1= new MethodsAssingment();
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		m1.sub(a, b);	

	}
	
	void sub(int a1,int a2){
		result=a1-a2;
		System.out.println("subof two numbers:"+result);
		System.out.println("enter c value:");
		int c=sc.nextInt();
		Add(result, c);
		
	}


	void Add(int b1,int b2) {
		result=b1+b2;
		System.out.println("Addtion of two numbers:"+result);
		System.out.println("enter d value:");
		int d=sc.nextInt();
		multiple(result,d);
		
	}
	void multiple(int c1,int c2) {
		result=c1*c2;
		System.out.println("multiplection of two numbers:"+result);
		System.out.println("enter e value:");
		int e=sc.nextInt();
		division(result,e);
		
	}
	void division(int d1,int d2) {
		result=d1/d2;
		System.out.println("divtion of  two numbers:"+result);
		int e=sc.nextInt();
		division(result,e);
	}
	void modulus(int e3,int e2) {
	result=e3%e2;
	System.out.println("modulus of two numbers:"+result);
}
}
