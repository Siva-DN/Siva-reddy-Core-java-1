package com.constructorsprograms;

public class Constructorspro1 {
	
	int empid;
	String empname;
	double empsal;
	
	
	Constructorspro1(){
		System.out.println("no agu constructor called");
		 empid=101;
		 empname="siva";
		 empsal =10000.0;
	}
	
	
	void display() {
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empname);
		System.out.println("empsalary:"+empsal);
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Constructorspro1 c1 =new Constructorspro1();
		
		c1.empid=102;
		c1.empname="phani";
		c1.empsal=200000;
		
		c1.display();
		
		Constructorspro1 c2 =new Constructorspro1(102,"phani",4000);
		c2.display();
		
		
		Constructorspro1 c3 =new Constructorspro1(103,"vamsi",4000.0);
		c3.display();
		
		Constructorspro1 c4 =new Constructorspro1(104,"siri",5000.0);
		c4.display();
		
		
		
	}
	
	Constructorspro1(int emp_id,String empname){
		System.out.println("parameterized constructor1 called");
		this.empid= emp_id;
		this.empname=empname;
		this.empsal=4000;
		
	}
	
	Constructorspro1(int emp_id,String empname,double empsal ){
		System.out.println("parameterized constructor2 called");
		this.empid= emp_id;
		this.empname=empname;
		//i can't pass any argument but to assign the value inside the object i will pass how it is possible?
		this.empsal=6000; 
	}
}
