package com.praticeprograms;

public class Dmart {
	
	int Walet = 100;
	String item = "pencil";
	int pencilcost = 7;
	
	{
		System.out.println("wallet_carry:"+Walet);
		System.out.println("pencil_cost:"+pencilcost);
		System.out.println("total_item_purchased:"+Walet/7);
		System.out.println("Remainingamount:"+Walet%14);
	}
	
	public static void main(String[] args) {
		Dmart d = new Dmart();

	}

}
