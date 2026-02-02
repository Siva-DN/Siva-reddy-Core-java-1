package com.constructorsprograms;

// we cannot extends the child class while in parent class we have any parameterized constructor
//we must create a no-arg constructor. so, we cannot create then compile time error will thrown.
public class Employeeconstructor {

	int empid;
	String name;
	double empsal;

	// no-arg constructor
	Employeeconstructor() {
		System.out.println("no-arg constructor from employee");

	}

	public Employeeconstructor(int empid, String name, double empsal) {
		super();
		this.empid = empid;
		this.name = name;
		this.empsal = empsal;
	}

	public static void main(String[] args) {
		System.out.println("main method strated from employee");

	}

}
//Implicit super constructor Employeeconstructor() is undefined for default constructor. 
//Must define an explicit constructor
class Person extends Employeeconstructor {

	public static void main(String[] args) {
		System.out.println("main method strated from person");

		Person p1 = new Person();
	}
}
