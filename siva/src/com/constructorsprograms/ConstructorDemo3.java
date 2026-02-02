package com.constructorsprograms;

public class ConstructorDemo3 {
	int empid;
	String empname;
	double empsal;
	long empphone;
	
	
	
	ConstructorDemo3(){
		System.out.println("NO-arg constructor");
		empid=102;
		empname="phani";
		empsal=800000D;
	    empphone= 8978845990L;
		
	}
	
	ConstructorDemo3(int empidd,String empname,double empsal,long empphone){
		System.out.println("parameterized  constructor1 called");
		this.empid=empidd;
		this.empname=empname;
		this.empsal=empsal;
		this.empphone=empphone;
	}

	void show() {
		
		System.out.println("***********************");
		System.out.println("employee_id:"+empid);
		System.out.println("employee_name:"+empname);
		System.out.println("employee_sal:"+empsal);
		System.out.println("employee_phone:"+empphone);
		
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		System.out.println("object1 info");
		
		ConstructorDemo3 c3=new ConstructorDemo3();
		c3.show();
		
	
		ConstructorDemo3 c4=new ConstructorDemo3();
	    c4.show();
	    
		ConstructorDemo3 c5=new ConstructorDemo3();
		c5.empid=103;
		c5.empname="siva";
		c5.empphone=89977;
		c5.empsal=50000;
	    c5.show();
	    
	    //parameterrized constructor....
	    
		ConstructorDemo3 c6=new ConstructorDemo3(501,"gopi",70000,89778);
	    c6.show();
	    
	    
	    ConstructorDemo3 c7=new ConstructorDemo3();
	    System.out.println("object5 info");
	    c7.show();
	    
	    
		
	}
	
	

}
