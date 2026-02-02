package com.oopsmainly;

public class TestEncapsulationPractic1 {

	private int s_id;
	private String s_name;
	private String s_course;
	private int total_fee;
	private int pay_fee;

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_Name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_course(String s_course) {
		this.s_course = s_course;
	}

	public String getS_course() {
		return s_course;
	}

	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}

	public int getTotal_fee() {
		return total_fee;
	}

	public void PayFee(int pay_fee) {
		this.pay_fee = 0;

	}

	public int getPay_fee() {
		return pay_fee;
	}

	public void payFee(double amount) {
		if (amount > 0 && amount < total_fee) {

			pay_fee += amount;

			System.out.println("Payment is Successfully" + amount);

		} else {
			System.out.println("Invalid Amount");
		}

	}

	public double getRemainingFee() {

		return total_fee - pay_fee;

	}

	void displayFeestatus() {

		System.out.println(s_id);
		System.out.println(s_name);
		System.out.println(s_course);
		System.out.println(getRemainingFee());
		System.out.println(pay_fee);
	}

}
