package com.praticeprograms;

public class Zoomcar {


	public static void main(String[] args) {
		System.out.println("main method started");
		Zoomcar c1 = new Zoomcar();
		
		
		System.out.println("companyname:"+c1.getname());
		System.out.println("carprice:"+c1.getprice());
		System.out.println("carinsurance:"+c1.getinsurance());
		System.out.println("rentaldays:"+c1.totaldays(10));
		System.out.println("perdaysrent:"+c1.calucatedaysprice());
		System.out.println("rental_insurance:"+c1.rental_insurance());
		


		

	}
	
	
	String getname() {
		String carname="tata";
		
		return carname;
	}
	
	double getprice() {
		double carprice = 1500;
		return carprice;
	}
	
	double getinsurance() {
		double carinsurance = 500;
		return carinsurance;
	}
 
	int totaldays(int  a) {
		int a1=10; 
		
		return a1;
	}
	
	double  calucatedaysprice() {
		double sum=(double)getprice()* totaldays(10);
		return sum;
		
		
	}
	double rental_insurance() {
		double total=calucatedaysprice()+getinsurance();
		return total;
	}
	
	
	

}
