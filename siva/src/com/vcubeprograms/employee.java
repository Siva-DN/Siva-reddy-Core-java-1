package com.vcubeprograms;

public class employee {
	//declaration part
	//instance variables
	int eno=12;
	String ename="phani";
	
	//static variables
	static int empid = 101;
	static String empname="siva";
	
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vcube institute");
		//object creation for instance data 
		employee e = new employee();
		
		//installization or assinging the data
		
		//accesing the static data
		System.out.println("empid:" + empid);
		System.out.println("empname:" +empname);
		
		//creating an object for instance variable
		System.out.println("object1 started");
		System.out.println("eno:"+ e.eno);
		System.out.println("ename:" +e.ename);
		
		System.out.println("object2 started");
		employee e1 = new employee();
		e1.eno =13;
		e1.ename = "srikanth";
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empname);
		System.out.println("eno:"+ e1.eno);
		System.out.println("eno:"+e1.ename);
		

		e1.eno=14;
		e1.ename ="dhoni";
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empname);
		
		System.out.println("eno:"+ e1.eno);
		System.out.println("eno:"+e1.ename);
		System.out.println("object3 created");
		employee e2 = new employee();
		System.out.println("new employeeid started");
		int empid=103;
		e2.eno = 105;
		e2.ename= "gopi";
		String empname = "karthik";
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empname);
		System.out.println("eno:"+ e2.eno);
		System.out.println("eno:"+e2.ename);
		
		}

}
