package com.praticeprograms;

/* 1. You are working on a multi-level class hierarchy involving a base class Vehicle, a subclass Car, and a further subclass ElectricCar. Each class has multiple constructors and needs to ensure proper initialization through constructor chaining. Demonstrate how constructor chaining works across this hierarchy and explain the order of constructor execution.

Write Java classes to illustrate:

 > The Vehicle class has a constructor that accepts String type.

 > The Car class extends Vehicle and has a constructor that accepts String type and String brand.

 > The ElectricCar class extends Car and has a constructor that accepts String type, String brand, and int batteryCapacity.

 > Show how constructor chaining is used to initialize all fields through parent and child class constructors. Provide a test class that creates an object of ElectricCar and prints constructor execution order.*/


class vehicle{
	String type;
	
	vehicle(String type){
		this.type=type;
	}
	
}

class car extends vehicle{
	String brand;
	
	car(String brand ,String type){
		super(type);
		this.brand=brand;
		
	}	
}


class electriccar extends car{
	
	electriccar(String brand,String type,int capacity) {
		super(brand,type);
		this.battery=capacity;
	}



	int battery;
	
	
	
    void show() {
    	System.out.println("Type:"+type);
    	System.out.println("brand:"+brand);
    	System.out.println("battery:"+battery);
    }
	
}

public class DriverVehicle {
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		electriccar e1=new electriccar("petrol","Tata",100000);
		e1.show();
		
		electriccar e2=new electriccar("Desil","Swift",2000000);
		e2.show();
		
		electriccar e3=new electriccar("Electric","Addi",3000000);
		e3.show();

	}

}
