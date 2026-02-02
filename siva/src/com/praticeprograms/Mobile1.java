package com.praticeprograms;


/* Q) Constructor Overloading
Create a class Mobile with the following:
Variables: brand, price, color
Create three constructors:
No-arg constructor → set default values.
Constructor with brand and price
Constructor with brand, price and color
Print the values from each constructor by creating 3 objects in main().
*/
public class Mobile1 {
	
	String brand;
	double price;
	String color;
	
	Mobile1(){
		brand="unknown";
		price=0.00d;
		color="unknown";
		
	}
	Mobile1(String brand,double price){
		this.brand=brand;
		this.price=price;
		
	}
	Mobile1(String brand,double price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
		
	}
	
	
	void show() {
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
	}

	public static void main(String[] args) {
		
		Mobile1 m1=new Mobile1();
		m1.show();
		
		Mobile1 m2=new Mobile1("vivo",25000);
		m2.show();
		
		Mobile1 m3=new Mobile1("iphone",100000,"white");
		m3.show();
		

	}

}
