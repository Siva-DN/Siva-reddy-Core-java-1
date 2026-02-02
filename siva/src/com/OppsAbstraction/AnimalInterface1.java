package com.OppsAbstraction;

public abstract interface AnimalInterface1 {

	public static final String orgName = "vcube";

	public abstract void eat();

	public abstract void sleep();

	void walk();

	void sound();

	public static void main(String[] args) {
		System.out.println("main method started");
		breath();
		hello();

	}

	// default method will introduced for "Backward compatibility"
	// It means if something has been changed in interfaces,
	// then all the classes who implemented that interface will be effected.

	// it requires lot of changes with classes and it would be Tightly coupled,
	// we can write any number of default methods in interface.
	// and also we can override default methods.

	private void welcome() {
		System.out.println("welcome !!!");
		System.out.println("welcome !!!");
		System.out.println("welcome !!!");
		System.out.println("welcome !!!");

	}

	default void run() {
		System.out.println("most of the animals can run !!");
		welcome();
	}

	default void swim() {
		System.out.println("Some of the animala are smim");
	}

	static void breath() {
		System.out.println("Any animals can breath !!");
	}

	static void hello() {
		System.out.println("hello vcube");
	}

}
