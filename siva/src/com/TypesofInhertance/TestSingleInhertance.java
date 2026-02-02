package com.TypesofInhertance;

//Implicit single inheritance
//
class Animal {

	String name = "Chintu";
	int age = 12;

	void animalInfo() {
		System.out.println("Every animal can run and walk !!!..");

	}

	void sound() {
		System.out.println("Every animal can Sound !!!..");

	}

	public static void main(String[] args) {
		System.out.println("main method started from animal..");
	}

}

//single inheritance
class Dog extends Animal {

	String name = "puppy";
	int age = 20;

	void display() {
		System.out.println("Name:" + super.name);
		System.out.println("Age:" + super.age);
	}

	@Override
	void sound() {
		System.out.println("BOW BOW..");

	}

	public static void main(String[] args) {
		System.out.println("main method started from dog..");

	}

}

//Hei-rarichal inheritance 
class BabyDog extends Dog {

}

/*Multiple inheritance does not support why below this
   class BabyDog extends Dog,Animal{
}*/



//Multiple inheritance does not support with constructors because below example..
class Vehicle {

	public Vehicle() {
		System.out.println("Vehicle constructor called");
	}

}

class Car {
	public Car() {
		System.out.println("Car constructor called");
	}
}


class Bike extends Vehicle {
	public Bike() {
		super();
		System.out.println("Bike constructor called");

	}

}
/* These will be Ambiguity 
   class Bike extends Vehicle,Car {
	  public Bike() {
		 super();
		System.out.println("Bike constructor called");
	} }
*/

//Driver class of all classes
public class TestSingleInhertance {

	public static void main(String[] args) {
		BabyDog d = new BabyDog();
		d.sound();
		d.animalInfo();
		d.display();
		System.out.println("name:" + d.name);
		System.out.println("age:" + d.age);

		Bike b = new Bike();

	}

}
