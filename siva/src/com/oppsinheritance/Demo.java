package com.oppsinheritance;

public class Demo {
	void method1() {
		System.out.println("Method1 from parent");
	}

	void method2() {
		System.out.println("Method2 from parent");
	}
}

class Demo2 extends Demo {
	void method2() {
		System.out.println("Method2 from child");
	}

	void method3() {
		System.out.println("Method3 from child");
	}

}

class Demo3 extends Demo2 {
	@Override
	void method2() {
		System.out.println("Method2 from grand");
	}

	void method3() {
		System.out.println("Method3 from grand");
	}

	void method4() {
		System.out.println("Method4 from grand");
	}

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
	}
}
