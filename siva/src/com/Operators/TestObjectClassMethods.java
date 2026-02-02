package com.Operators;

//object class methods...?
public class TestObjectClassMethods implements Cloneable {

	// finalize();
	@Override
	protected void finalize() throws Throwable {
		System.out.println("fanilize called");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		TestObjectClassMethods t1 = new TestObjectClassMethods();

		// clone() method: copying the
		TestObjectClassMethods t2 = (TestObjectClassMethods) t1.clone();
//		Un-handled exception type CloneNotSupportedException
//		TestObjectClassMethods t2=(TestObjectClassMethods) t1.clone();

		System.out.println(t1.getClass());// class com.oops1.TestObjectClassMethods
		System.out.println(t2.hashCode());// 498931366

		System.out.println(t2);//
		System.out.println("*************************");
		t2 = null;

		System.out.println(t1);
		System.out.println(t2);
	}

}
