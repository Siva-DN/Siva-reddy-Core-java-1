package com.OppsAbstraction;

public class DriverAnimalInterface {

	public static void main(String[] args) {
		System.out.println("main method started");
//		Cannot instantiate the type AnimalInterface1
//		AnimalInterface1 a1 =new AnimalInterface1();

		System.out.println("Dog information ********");
		AnimalInterface1 d = new Dog1();

		d.eat();
		d.sleep();
		d.walk();
		d.sound();
		d.run();
		d.swim();
		AnimalInterface1.breath();

		System.out.println();
		System.out.println("monkey information ****************");
		AnimalInterface1 m = new Monkey1();
		m.eat();
		m.sleep();
		m.walk();
		m.sound();
		m.run();
		m.swim();
		AnimalInterface1.breath();
		System.out.println();
		System.out.println("cat information ****************");
		AnimalInterface1 c = new Cat1();
		c.eat();
		c.sleep();
		c.walk();
		c.sound();
		c.run();
		c.swim();
		//This static method of interface AnimalInterface1 
		//can only be accessed as AnimalInterface1.breath
		//c.breath();
		AnimalInterface1.breath();
		
		System.out.println("main method ended");

	}

}
