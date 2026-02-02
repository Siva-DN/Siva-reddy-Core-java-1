package com.constructorsprograms;
//constructor chaining or constructor overloading example
public class Studentconstr1 {
	
	int stdid;
	String stdname;
	String stdcourse;
	int stdmarks;
	
	
	Studentconstr1(){
		System.out.println("noarg-constructor");
		 stdid=203;
		 stdname="siri";
		 stdcourse="jfs";
		 stdmarks=100;
	}
	
	Studentconstr1(int id, String name) {
		this.stdid = id;
		this.stdname = name;
//		this.stdcourse = course;
//		this.stdmarks = marks;
	}
	
	Studentconstr1(int id, String name, String course) {
		this.stdid = id;
		this.stdname = name;
		this.stdcourse = course;
//		this.stdmarks = marks;
	}
	
	Studentconstr1(int id, String name, String course,int stdmarks) {
		this.stdid = id;
		this.stdname = name;
		this.stdcourse = course;
		this.stdmarks = stdmarks;
	}
	
	
	
	
	void display(){
		System.out.println("stdid:"+stdid);
		System.out.println("stdname:"+stdname);
		System.out.println("stdcourse:"+stdcourse);
		System.out.println("stdmarks:"+stdmarks);
	}
	

	public static void main(String[] args) {
		Studentconstr1 s1=new Studentconstr1();
		s1.display();
		
		Studentconstr1 s2=new Studentconstr1(401,"krishna");
		s2.display();
		
		Studentconstr1 s3=new Studentconstr1(501,"dhoni","testing");
		s3.display();
		
		Studentconstr1 s4=new Studentconstr1(501,"dhoni","testing",80);
		s4.display();
		
		Studentconstr1 s5=new Studentconstr1();
		s5.display();
		
		

	}

}
