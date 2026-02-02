package com.constructorsprograms;

//constructor chaining
class employee5{
int empid;
String empname;
//no-arg constructor
employee5(){
	
}
//parent class
 employee5(int empid,String empname){
	 this.empid=empid;
	 this.empname=empname;
	 System.out.println("main method started from employee");
 }

	}	
//child class
 class person extends employee5{
	 
	 //parameterized constructor
	  person(int empid ,String empname){
	  super(empid,empname);  
	  this.empid=empid;
	  this.empname=empname;
	  System.out.println(empid);
	  System.out.println(empname);
	 }
	 
 }
	 
	 public class StudentD1 {
		public static void main(String[] args) {
		System.out.println("main method strated ");
		person p2=new person(101,"siva");
		}
		
	}


