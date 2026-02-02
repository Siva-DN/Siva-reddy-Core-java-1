package com.praticeprograms;

public class Employee {
	
	
	static{
		Integer empid=101;
		String empname="siva";
		Integer empsalary=5000;
		Integer experience=2;
		Double Annualbonus;
		Double totalearnings;
	    
		empsalary= empsalary*12;
		System.out.println("empsalary:"+empsalary);
		Annualbonus=empsalary*0.10;
		System.out.println("Annualbonus:"+Annualbonus);
		
		totalearnings=empsalary+Annualbonus; 
		
		System.out.println("totalearnings:"+totalearnings);
		
	}

	public static void main(String[] args) {
		
		

	}

}
