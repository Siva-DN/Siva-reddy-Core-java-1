package com.praticeprograms;

public class Course {
	
	int courseid;
	String coursename;
	int duration;
	
	
	
	Course(){
		this(101);
		System.out.println("no-arg constructor called");
	}
	
	Course(int courseid){
		
		this(courseid,"java");
		
		System.out.println("one arg const called");
		
		
	}
	Course(int courseid,String corsername){
		this(courseid,corsername,6);
		System.out.println("two arg const called");
	}
	
	Course(int courseid,String coursename,int duration){
		System.out.println("three arg const called");
		this.courseid=courseid;
		this.coursename=coursename;
		this.duration=duration;
		
		display();
	}
	
	void display(){
		System.out.println("id:"+courseid);
		System.out.println("name:"+coursename);
		System.out.println("duration:"+duration);
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Course c1= new Course();
		
		Course c2=new Course(102,"testing",5);
	
		
		Course c3=new Course(103,"devops",9);
			
		
	}

}
