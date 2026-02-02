package com.accessmodifiersprograms;

//Illegal modifier for the class TestAccessModifiers1; 

//only public, abstract,strict-fp,<default> & final are permitted

public class TestAccessModifiers1 {

	static {
		System.out.println("static block called from TestAccessModifiers1");
	}

	{
		System.out.println("instance block called from TestAccessModifiers1");
	}

// protected Data members 
	
	protected int a4=7;
	protected String name4="msd";
	
	protected void method4() {
		System.out.println("method4 called");
	}
	
	
	// public data members
	public int a3 = 45;
	public String name3 = "Rohit";

	public void method3() {
		System.out.println("method3 called");
	}

	// Default Data members
	int a2 = 101;
	String name2 = "dhoni";

	void method2() {
		System.out.println("method2 called");
	}

	// private Data members
	private int a1 = 10;
	private String name1 = "siva";

	private void method1() {
		System.out.println("method1 called");
	}

//	private  TestAccessModifiers1{
//		System.out.println("no arg constructor");
//	}

	public static void main(String[] args) {
		System.out.println("main method started");

		TestAccessModifiers1 t1 = new TestAccessModifiers1();

		// note: we can access private data members with in the classes only
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();
		
		
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();
		

	}

}
