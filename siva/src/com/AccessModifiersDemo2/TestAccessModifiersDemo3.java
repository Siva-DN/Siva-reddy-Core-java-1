package com.AccessModifiersDemo2;

import com.accessmodifiersprograms.TestAccessModifiers1;

public class TestAccessModifiersDemo3 extends TestAccessModifiers1 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessModifiersDemo3 ");

		// yes// we can create object of the classes from outside of the package,
		// whenever the class is public and after import only.
		// Note:we can import classes whenever the classes are public.
		TestAccessModifiers1 t1 = new TestAccessModifiers1();

		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
		
		
		//The method method4() from the type TestAccessModifiers1 is not visible
	    // Accessing the protected data members outside of the packages not directly
		//we can access protected data outside of the package of sub classes with sub class object reference only.  
		TestAccessModifiersDemo3 t3=new TestAccessModifiersDemo3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();

		// whenever the class scope is default we cannot create object outside of the
		// package
		// TestAccessModifiers1 t1 = new TestAccessModifiers1();

	}

}
