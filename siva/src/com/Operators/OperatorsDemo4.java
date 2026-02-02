package com.Operators;

//.equals method  checks for the content of the string only.
// == operator meant for checking the address of the objects if it is object data types 
public class OperatorsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");

		String s1 = "Siva";// string literal--->1 object created
		String s2 = "Siva";// string literal--->0 object created //s2 is pointing to s1 old object whenever
							// it has same data

		String s3 = "java";// String literals-->1 object created
		String s4 = new String("java");// string literals--heap memory-->1 object created again because
		String s5 = new String("Java");

		System.out.println(s4);

		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true
		System.out.println(s4.equalsIgnoreCase(s5));// true
		System.out.println(s3 == s4);// false
		System.out.println(s4 == s5);// false

		String s6 = "java";
		String s7 = new String("java");// string with new keyword --heap-->2objects created one in SCp(there is no
										// reference) and another in heap memory

		System.out.println(s6);// java
		System.out.println(s7);// java

		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());

		// If we want String identity hashCode in String class in method name to find
		// the addresses of the String object
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
	}

}
