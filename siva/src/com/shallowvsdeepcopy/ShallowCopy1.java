package com.shallowvsdeepcopy;

//Shallow copy is copying the one object data to another object data 
//with the help of clone-able method throws and implements clone-able
//then if we change address of second object data it will change the first object data also
//this is the major default this shallow copy.
class Student implements Cloneable {
	int sid;
	String sname;
	Address address; // referenced object variable we consider

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class ShallowCopy1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("markapur");

		Student s1 = new Student(101, "siva", add);
		System.out.println("**************************");
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		System.out.println("**************************");
		Student s2 = (Student) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

		System.out.println("**************************");

		s2.address.city = "hyd";
		System.out.println(s2.address.city);
		System.out.println(s1.address.city);

		s1.address.city = "beng";
		System.out.println(s2.address.city);
		System.out.println(s1.address.city);

//		s2.sid=102;
//		s2.sname="sree";
//		s2.address.city="hyd";
//		
//		System.out.println(s1.sid);
//		System.out.println(s1.sid);
//		System.out.println(s1.sid);
//		
//		
//		System.out.println(s2.sid);
//		System.out.println(s2.sid);
//		System.out.println(s2.sid);
//
//
	}

}
