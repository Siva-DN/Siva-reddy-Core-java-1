package com.oppsinheritance;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Loan implements LoanIn {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)throws Exception{
		Loan l1= new Loan();
		System.out.println("Loan:"+l1.getloanROI(20));
		System.out.println(l1.welcome());

	}

//      -----------pancard-num:GEREX0956E--------------
	@Override
	public boolean getValidatePan() {
		System.out.println("enter your valid Pannumber:");
		String pannum = sc.next();

		String panRegex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}";
		return Pattern.matches(panRegex, pannum);

	}
	// --------- Aadharcard-num:835858226468--------------
	public boolean getValidateAadhar() {
		System.out.println("Enter your AdharNumber:");
		String aadharnum = sc.next();
		String aadharRegex = "^[2-9][0-9]{11}$";
		return Pattern.matches(aadharRegex, aadharnum);
	}

// -----------------mobile validation-----------------
	public boolean getMobileNUmber() {
		System.out.println("Enter your Mobile Number:");
		String mobile = sc.next();

		String mobileRegex = "[6-9]{1}[0-9]{9}";
		return Pattern.matches(mobileRegex, mobile);
	}

//        ----------Age validation----------
	public int getCustomerage() {
		System.out.println("enter your age:");
		int age = sc.nextInt();
		return age;
	}

	Number getloanROI(long loan) {
		return 10.5;
	}
	
      Object welcome() {
		return "hello";
	}
       void hello() {
    	   System.out.println("hey");
       }

//      ---------cibilScore validation---------------
	public int getCibilScore() {
		System.out.println("Enter your cibil score:");
		int cibilscore = sc.nextInt();
		return cibilscore;
	}

//  	  ---------SalaryInfo Validation---------
	public double getSalaryInfo() {
		System.out.println("Enter your salary Info:");
		double salary = sc.nextDouble();
		return salary;
	}

}
