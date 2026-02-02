package com.languagefundamentals;

import java.util.Scanner;

public class MethodsPractice6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		MethodsPractice6 m6 = new MethodsPractice6();
		System.out.println("Enter the Id");
		int Id =sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the height");
		float height=sc.nextFloat();
		System.out.println("Enter the phone");
		long phone=sc.nextLong();
		System.out.println("Enter the gender");
		char gender=sc.next().charAt(4);
		
		m6.Id(Id);
		m6.Name(name);
		m6.Age(age);
		m6.Height(height);
		m6.phone(phone);
		m6.gender(name);
		

	}
	
	void Id(int x) {
		System.out.println("my id is:"+x);
	}
	void Name(String x) {
		System.out.println("my name is:"+x);
	}
	void Age(int y)  {
		System.out.println("my age is:"+y);
	}
	void Height(float x) {
		System.out.println("my height is:"+x);
	}
	void phone(long r) {
		System.out.println("my phone numbers is:"+r);
	}
	void gender(String v) {
		System.out.println("my gender is:"+v);
	}
}
