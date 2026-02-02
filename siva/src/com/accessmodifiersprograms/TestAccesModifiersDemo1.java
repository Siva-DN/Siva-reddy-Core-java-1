package com.accessmodifiersprograms;

public class TestAccesModifiersDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started TestAccesModifiersDemo1");
		TestAccessModifiers1 t1 = new TestAccessModifiers1();

		// Note:Accessing the default data members for outside of the class within the
		// package is possible
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();
		
		
		// Accessing the protected data members outside of the classes
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

		// Note: If a constructor is private we cannot create objects outside of the
		// classes.
		// The constructor TestAccessModifiers1() is not visible
//		 TestAccessModifiers1 t1 = new TestAccessModifiers1();

// Note: private data members we cannot access
//System.out.println(t1.a1);//The field TestAccessModifiers1.a1 is not visible
//System.out.println(t1.name1);//The field TestAccessModifiers1.a1 is not visible
//t1.method1();//The method method1() from the type TestAccessModifiers1 is not visible
	}

}
