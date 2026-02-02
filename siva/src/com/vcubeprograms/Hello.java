//how to increment the account number everyTime will change...? 
package com.vcubeprograms;

public class Hello {
	String name;
	static long money = 20000;
	static long accountNo = 123456;
	{
		accountNo++;
		money++;
	}

	// method with no return type and no parameters
	void m1() {

	}

	// method with no return type and with parameters
	void m1(int a) {

	}

	// method with return type and no parameters
	int m2() {
		return 0;
	}

	// method with return type and no parameters
	int m3(int a) {
		return 0;
	}

	void main() {
		System.out.println("main method");
		Hello h1 = new Hello();

		System.out.println(h1.name = "Apple");
		System.out.println(money);
		System.out.println(accountNo);

		Hello h2 = new Hello();
		System.out.println(h2.name = "abc");
		System.out.println(money);
		System.out.println(accountNo);

		Hello h3 = new Hello();
		System.out.println(h3.name = "xyz");
		System.out.println(money);
		System.out.println(accountNo);

	}

}
