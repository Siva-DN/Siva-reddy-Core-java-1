package com.praticeprograms;

public class Item {

	String item_Name;
	int price;
	String code;

	public Item(String item_Name, int price, String code) {
		super();
		this.item_Name = item_Name;
		this.price = price;
		this.code = code;
	}

	boolean isFree() {
		int temp = a;
		int r = 0;
		int rev = 0;

		while (a != 0) {
			r = a % 10;
			rev = rev * 10 + r;
			a = a / 10;
		}

		if (temp == rev) {
			return true;
		} else {
			return false;
		}
	}
}
