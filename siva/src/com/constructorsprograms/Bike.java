package com.constructorsprograms;

//constructor overloading
public class Bike {

	String model;
	String brand;
	double price;
	String color;
	long platenum;

	Bike() {
		System.out.println("no-arg constructor called");

		model = "hero";
		brand = "tvs";
		price = 50000;
		color = "blue";
		platenum = 5676;
	}

	Bike(String m1, String b1) {
		System.out.println("parameterized constructor 1 called");
		this.model = m1;
		this.brand = b1;
		// this.price=p1;
		// this.color=c1;
		// this.platenum=n1;

	}

	Bike(String m1, String b1, double p1) {
		System.out.println("parameterized constructor 2 called");
		this.model = m1;
		this.brand = b1;
		this.price = p1;
		// this.color=c1;
		// this.platenum=n1;

	}

	Bike(String m1, String b1, double p1, String c1) {
		System.out.println("parameterized constructor 3 called");
		this.model = m1;
		this.brand = b1;
		this.price = p1;
		this.color = c1;
		// this.platenum=n1;

	}

	void display() {
		System.out.println("model of bike:" + model);
		System.out.println("brand of bike:" + brand);
		System.out.println("price of bike:" + price);
		System.out.println("color of bike:" + color);
		System.out.println("platenum of bike:" + platenum);

	}

	public static void main(String[] args) {

		Bike b1 = new Bike();
		b1.display();

		Bike b2 = new Bike("honda", "pulsur");
		b2.display();

		Bike b3 = new Bike("honda", "pulsur", 1200000);
		b3.display();

		Bike b4 = new Bike("honda", "pulsur", 1200000, "black");
		b4.display();

	}

}
