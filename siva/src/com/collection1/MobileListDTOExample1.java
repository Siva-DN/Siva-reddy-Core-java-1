package com.collection1;

//It is like a DTO CLAss
public class MobileListDTOExample1 {

	String model;
	String brand;
	double price;
	String color;
	int ram;

	public String toString() {
		return "Mobile: model =" + model + " Brand:" + brand + "  price:" + price + " color:" + color + "  ram:" + ram;
	}

	public MobileListDTOExample1(String model, String brand, double price, String color, int ram) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
	}

}
