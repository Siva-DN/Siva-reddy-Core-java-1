package com.constructorsprograms;

class Flower{
	String name;
	int size=10;
	
	//parameterized constructor
	Flower(String name){
		System.out.println("paramerized constructor from flower");
		this.name=name;
	}
	
	//no-arg constructor
	Flower(){
		System.out.println("no-arg constructor from Flower");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started from flower");
	
	}
	
}

// every constructor in java,will call super() without fail,
//if we are not calling any other constructor explicitly
public class Jasmindemo1 extends Flower {
//	String name ="kanakum";
	
	//no-arg constructor
	Jasmindemo1(){
		super("puppy");
		System.out.println("no-arg constructor from jasmindemo");
	}
	
	//parameterized constructor
	Jasmindemo1(String name){
		
		System.out.println("paramiterized constructor from jasmindemo");
		super(name);
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started from jasmindemo");
		Jasmindemo1 j1=new Jasmindemo1(); //default constructor-->super class constructor
		
		System.out.println(j1.name);
		System.out.println(j1.size);
		
		Jasmindemo1 j2=new Jasmindemo1("malli");
		System.out.println(j2.name);

	}

}
