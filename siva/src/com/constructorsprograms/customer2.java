package com.constructorsprograms;

public class customer2 {
	
	 int cumid;
	 String cumname;
	 long phone;
	 double cumsal;

	
	
	customer2(){
		System.out.println("no_arg constructors");
		cumid=101;
		cumname="simha";
		phone=8978845990L;
		cumsal=50000;
		
	}
	
	customer2(int cumidd,String cumnamee,long phonee,double cumsall){
		System.out.println("parameterized constructors");
		this.cumid=cumidd;
		this.cumname=cumnamee;
		this.phone=phonee;
		this.cumsal=cumsall;
	}
	
	void show(){
		System.out.println("cumid:"+cumid);
		System.out.println("cumname:"+cumname);
		System.out.println("cumphone:"+phone);
		System.out.println("cumsal:"+cumsal);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		customer2 c2=new customer2();
		c2.show();
		
		customer2 c3=new customer2();
		c3.cumid=201;
		c3.cumname="phani";
		c3.phone=2344555L;
		c3.cumsal=40000;
		c3.show();
		
		
		customer2 c4=new customer2(301,"siva",233455L,30000);
		c4.show();
		
		customer2 c5=new customer2(401,"priya",599990L,70000);
		c5.show();
		
	}

}
