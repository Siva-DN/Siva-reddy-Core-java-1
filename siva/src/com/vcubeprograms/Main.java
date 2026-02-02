package com.vcubeprograms;


//1)
class Ride{
	void fare(int a) {
		System.out.println("Int Fare");
	}
	
	class CareRide extends Ride{
		void fare(double a) {
			System.out.println("Double Fare ");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		//CarRide cannot be resolved to a type
		//Ride r=new CarRide();
		//r.fare(5);
		
		//2)No enclosing instance of type Main is accessible. 
		//Must qualify the allocation with an enclosing instance of type Main 
		//(e.g. x.new A() where x is an instance of Main).
		//Child c= new Child();
		//Driver d=new Driver();
		//d.special();
	}
	//2)
	class Parent {
		String name="parent";
	}
class Child extends Parent{
	String name ="child";
	
	void show() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

class Driver{
	void ride() {
		System.out.println("normal ride");
	}
	class AutoDriver extends Driver{
		@Override
		void ride() {System.out.println("AutoRide");}
		void special() {System.out.println("special Auto");}
	}
}

}
