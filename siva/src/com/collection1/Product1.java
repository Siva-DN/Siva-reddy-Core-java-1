package com.collection1;
//Comparable
public class Product1 implements Comparable<Product1> {

	int pid;
	String pname;
	double price;

	public Product1(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product1 [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product1 o) {

//		if (this.price < o.price) {
//			return -1;
//		} else if (this.price > o.price) {
//			return 1;
//		} else {
//			return 0;
//
//		}
		return this.pname.compareTo(pname);
	}

}
