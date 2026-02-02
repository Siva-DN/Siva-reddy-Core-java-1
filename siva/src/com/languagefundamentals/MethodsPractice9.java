package com.languagefundamentals;

//methods using to scanner with return type +no arguments 
//
import java.util.Scanner;

public class MethodsPractice9 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		MethodsPractice9 m9 = new MethodsPractice9();
		short pro = m9.pro();
		byte num = m9.num();
		int pronum = m9.projectno();
		boolean logo = m9.logo();
		double inco = m9.c_income();
		long cid = m9.getcompany_Details();
		String c_Name = m9.company_name();
		System.out.println("pro:" + pro);
		System.out.println("num:" + num);
		System.out.println("pronum:" + (pronum));
		System.out.println("companyid:" + (cid));
		System.out.println("income:" + (inco));
		System.out.println("company name:" + (c_Name));
		System.out.println("company logo:" + (logo));

	}

	byte num() {
		System.out.println("enter company num:");
		byte num = sc.nextByte();
		return num;

	}

	short pro() {
		System.out.println("enter company pro:");
		short pro = sc.nextShort();
		return pro;
	}

	int projectno() {
		System.out.println("enter company pronum:");
		int pronum = sc.nextInt();
		return pronum;
	}

	boolean logo() {
		System.out.println("enter company logo:");
		boolean logo = sc.nextBoolean();
		return logo;
	}

	double c_income() {
		System.out.println("enter the income:");
		long income = sc.nextLong();
		double inco = sc.nextDouble();
		String sncome = sc.next();
		return income;

	}

	String company_name() {
		System.out.println("enter the company name");
		String c_Name = sc.next();
		return c_Name;
	}

	long getcompany_Details() {
		System.out.println("enter your companydetails");
		System.out.println("your company id");
		long c_id = sc.nextLong();

		return c_id;

	}

}
