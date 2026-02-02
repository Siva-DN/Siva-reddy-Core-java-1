//create a class object count and you can create 4 objects in main method and find the object count..? 
package com.vcubeprograms;

public class Employee1 {
	int id = 101;
	int idd = 102;
	String name = "siva";
	String name1 = "gopi";
	static int count = 0;
	{
		count = count + 2;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1();
		Employee1 e3 = new Employee1();
		Employee1 e4 = new Employee1();

		System.out.println("count of the object:" + count);
		System.out.println(e2.id);
		System.out.println(e1.idd);
		System.out.println(e3.idd);
		System.out.println(e3.name);
		System.out.println(e3.name1);
		System.out.println(e4.name1);
	}
}
