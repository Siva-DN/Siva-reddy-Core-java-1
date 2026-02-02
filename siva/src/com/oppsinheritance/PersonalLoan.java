package com.oppsinheritance;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PersonalLoan extends Loan {

	// First We have take user/person validates and eligibility criteria purpose we
	// take some methods like

	static Scanner sc = new Scanner(System.in);
	
	
	@Override
	Double getloanROI(long  loan) {
		return 9.5;
	}

	    Object welcome() {
		return "hii";
	}
	    void hello() {
	    	
	    }
	  

	public static void main(String[] args)throws Exception {
		System.out.println("Welocme to Sbi personal loan Banking");

		PersonalLoan p1 = new PersonalLoan();

		System.out.println("loan:"+p1.getloanROI(30));
		System.out.println(p1.welcome());

		

		if (p1.getMobileNUmber() && p1.getValidateAadhar() && p1.getValidatePan()) {
			double salary = p1.getSalaryInfo();
			int cibilscore = p1.getCibilScore();
			int age = p1.getCustomerage();

			if (salary > 200000.00 && age > 22 && cibilscore > 800) {
				System.out.println("congrtulations !! your loan was approved !!");
				System.out.println("Your laon ROI is:" + p1.getloanROI(30));
				System.out.println("Enter youe address details:");

			} else {
				System.out.println(" Soory !! your loan is Rejected !!");
			}
		} else {
			System.out.println("Your data is incoorect it's not matching with any profile, provide valid details !!");
		}
	}

}
