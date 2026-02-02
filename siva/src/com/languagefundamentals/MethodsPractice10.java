package com.languagefundamentals;

//method using with scanner class for with return type + with arguments
//
import java.util.Scanner;

public class MethodsPractice10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main mathod started");
		MethodsPractice10 m10 = new MethodsPractice10();
		int id = m10.getemployeedetalis();
		String empname = m10.emp_name();
		double empsal = m10.emp_salary();
		String empgender = m10.empgender();
		long empphone = m10.empphone();
		int empage = m10.empage();
		String emprole = m10.emprole();
		int empbonus = m10.empbonus();
		System.out.println("your emp_id:" + id);
		System.out.println("your empname:" + empname);
		System.out.println("your emp_id:" + empsal);
		System.out.println("your emp_id:" + empgender);
		System.out.println("your emp_id:" + empphone);
		System.out.println("your emp_id:" + empage);
		System.out.println("your emp_id:" + emprole);
		System.out.println("your emp_id:" + empbonus);

	}

	int getemployeedetalis() {
		System.out.println("enter the employee details");
		System.out.println("enter emp_id:");
		int id = sc.nextInt();
		return id;
	}

	String emp_name() {
		System.out.println("empname:");
		String empname = sc.next();
		return empname;
	}

	double emp_salary() {
		System.out.println("empsalary:");
		double empsal = sc.nextDouble();
		return empsal;
	}

	String empgender() {
		System.out.println("empgen:");
		String empsal = sc.next();
		return empsal;
	}

	long empphone() {
		System.out.println("empphone:");
		long empphone = sc.nextLong();
		return empphone;
	}

	int empage() {
		System.out.println("empage:");
		int empage = sc.nextInt();
		return empage;
	}

	String emprole() {
		System.out.println("emprole:");
		String emprole = sc.next();
		return emprole;
	}

	int empbonus() {
		System.out.println("empbonus:");
		int empbonus = sc.nextInt();
		return empbonus;
	}
}
