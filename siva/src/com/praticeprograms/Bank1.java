package com.praticeprograms;

import java.util.Scanner;

public class Bank1 {
	
	
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		System.out.println("main method started");
//		System.out.println("my branchname:"+branchname);
//		System.out.println("my bany ifsccode:"+ifsccode);
//		System.out.println("my bany ifsccode:"+ifsccode);
		
		Bank1 b1=new Bank1(); 
		long accnum=b1.Accountno();
		String holdername=b1.accountername();
		double deposit=b1.deposit();
		double d1=b1.fixedsavingamount();
		double afterdeposit=b1.deposit()+d1;
		double withdraw=b1.withdraw()-d1;
		
		System.out.println("my accnum:"+accnum);
		System.out.println("my holdername:"+holdername);
		System.out.println("my deposit:"+deposit);
		System.out.println("my savingamount:"+d1);
		System.out.println("my withdrawamount:"+withdraw);
		
		
	}
	
	long Accountno() {
		System.out.println("enter accnum:");
		long accnum =sc.nextLong();
		
		return accnum;
	}
	
	String accountername() {
		System.out.println("enter accountername:");
		String holdername=sc.next();
		return holdername;
		
	}
	
	double deposit() {
		System.out.println("enter depositamount:");
		double depsit=sc.nextDouble();
		return depsit;
		
	}
	
	double fixedsavingamount() {
		double amount=200000;
		return amount;
	}
	double withdraw() {
		System.out.println("my withdraw amount:");
		double withdraw=sc.nextDouble();
		return withdraw;
	}

}
