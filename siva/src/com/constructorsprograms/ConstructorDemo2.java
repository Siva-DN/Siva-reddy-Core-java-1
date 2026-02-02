package com.constructorsprograms;
//constructor chaining 
public class ConstructorDemo2 {
	
	int stdid;
	String stdname;
	double stdmarks;
	int stdage;
	
	
	ConstructorDemo2(){
		//calling one-arg constructor into no-arg constructor 
		System.out.println("no-arg constructor");
		this(100);
	}
	
	ConstructorDemo2(int stdid){
		this(stdid,"phani");
		System.out.println("one-arg constructor called");
		
	}
	
	
	ConstructorDemo2(int stdid,String stdname){
		this(stdid,stdname,100);
		System.out.println("two-arg constructor called");
		
	}
	
	ConstructorDemo2(int stdid,String stdname,double stdmarks){
		this(stdid,stdname,stdmarks,23);
		System.out.println("three-arg constructor called");
		
		
	}
	
	ConstructorDemo2(int stdid,String stdname,double stdmarks,int stdage){
		System.out.println("four-arg constructor called");
		this.stdid=stdid;
		this.stdname=stdname;
		this.stdmarks=stdmarks;
		this.stdage=stdage;
	}
	
	
	
	
	
	
	void show(){
		System.out.println("*****************");
		System.out.println("std_id:"+stdid);
		System.out.println("std_name:"+stdname);
		System.out.println("std_marks:"+stdmarks);
		System.out.println("std_age:"+stdage);
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		ConstructorDemo2 c1=new ConstructorDemo2();
		c1.show();
		
		
		ConstructorDemo2 c2=new ConstructorDemo2(101);
		c2.show();
		
		ConstructorDemo2 c3=new ConstructorDemo2(102,"dhoni");
		c3.show();
		
		ConstructorDemo2 c4=new ConstructorDemo2(103,"siri",200);
		c4.show();
		
		ConstructorDemo2 c5=new ConstructorDemo2(104,"divya",500,23);
		c5.show();
		
		
		

	}

}
