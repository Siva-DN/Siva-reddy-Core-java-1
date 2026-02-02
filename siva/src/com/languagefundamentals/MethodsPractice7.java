package com.languagefundamentals;

import java.util.Scanner;

public class MethodsPractice7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("employee Info in tcs");
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter empname");
		String empname = sc.nextLine();
		System.out.println("enter emage");
		int empage = sc.nextInt();
		System.out.println("enter empgender");
		char empgender = sc.next().charAt(0);
		System.out.println("enter empphone");
		long empphone = sc.nextLong();
		System.out.println("enter empGmail");
		sc.nextLine();
		String empGmail = sc.nextLine();
		System.out.println("enter empstatus");
		String empstatus = sc.nextLine();
		System.out.println("enter empsalary");
		double empsal = sc.nextDouble();
		System.out.println("enter empbonus");
		double empbounus = sc.nextDouble();

		MethodsPractice7 m7 = new MethodsPractice7();
		m7.empId(id);
		m7.empname(empname, empbounus);
		m7.empage(empage);
		m7.empGender(empgender);
		m7.empphone(empphone);
		m7.empGmail(empGmail);
		m7.empstatus(empstatus);
		m7.empsalary(empsal);
		m7.empbonus(empbounus);
		sc.close();

	}

	void empId(int a) {
		System.out.println("empId is:" + a);

	}

	void empname(String b, double k) {
		System.out.println("empname is:" + b);
	}

	void empage(int c) {
		System.out.println("empage is:" + c);
	}

	void empGender(char d) {
		System.out.println("empgender is:" + d);
	}

	void empphone(long f) {
		System.out.println("empphone is:" + f);
	}

	void empGmail(String g) {
		System.out.println("empGmail is:" + g);
	}

	void empstatus(String h) {
		System.out.println("empstatus is:" + h);
	}

	void empsalary(double j) {
		System.out.println("empsalary is:" + j);
	}

	void empbonus(double k) {
		System.out.println("empbonus is:" + k);
	}
}
