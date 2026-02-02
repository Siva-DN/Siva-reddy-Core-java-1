
package com.vcubeprograms;

public class Homeloan {

	String borrowerName;
	double loanAmount;
	int years;
	double totalrepay;

	static {
		System.out.println("Home Loan Department Activated");

	}

	// instance methods
	void calculateRepayment() {
		totalrepay = loanAmount + (1 * loanAmount * years);
	}

	public static void main(String[] args) {
		Homeloan h1 = new Homeloan();
		h1.borrowerName = "abhi";
		h1.loanAmount = 2000;
		h1.years = 5;
		h1.totalrepay = 300;
		h1.calculateRepayment();

		System.out.println("borrowerName:" + h1.borrowerName);
		System.out.println("loanAmount:" + h1.loanAmount);
		System.out.println("years:" + h1.years);
		System.out.println("totalrepay:" + h1.totalrepay);

		Homeloan h2 = new Homeloan();
		h2.borrowerName = "siva";
		h2.loanAmount = 3000;
		h2.years = 10;
		h2.calculateRepayment();
		System.out.println(h2.borrowerName);
		System.out.println(h2.loanAmount);
		System.out.println(h2.years);
		System.out.println(h2.totalrepay);

	}

}
