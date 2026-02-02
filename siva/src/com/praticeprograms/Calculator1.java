package com.praticeprograms;

import java.util.Scanner;

public class Calculator1 {
	static Scanner sc=new Scanner(System.in);
	
	int addition() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum =a+b;
		return sum;	
	}
	
	int subbration() {
		int c=sc.nextInt();
		int d=sc.nextInt();;
		int sub=c-d;
		return sub;
	}
	
	int multiple() {
		int e=sc.nextInt();
		int f=sc.nextInt();
		int mul=e*f;
		return mul;
	}
	
	int division() {
		int g=sc.nextInt();
		int h=sc.nextInt();
		int div=(int) ((double)g/h);
		return div;
	}
	
	
	void total() {
		System.out.println("addition:"+addition());
		System.out.println("subration:"+subbration());
		System.out.println("multiplication:"+multiple());
		System.out.println("division:"+division());
		
	}
	
	

	public static void main(String[] args) {
		Calculator1 c1= new Calculator1();
		
		c1.total();

	}

}
