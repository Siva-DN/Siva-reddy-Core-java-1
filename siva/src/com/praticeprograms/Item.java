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
		int l=0;
		int r=code.length()-1;
		
		char ch[] =code.toCharArray();
		
		while(l<=r) {
			char temp=ch[l];
			ch[l]=ch[r];
			ch[r]=temp;
			
			l++;
			r--;
		}
		
		return new String(ch)==code;
	}
}
