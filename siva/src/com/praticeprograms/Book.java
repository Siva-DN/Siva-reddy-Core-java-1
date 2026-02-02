package com.praticeprograms;

public class Book {
	
	int BookId=101;
	String BookTitle="java";
	String BookAuthor="Srikanth sir";
	double Price=200; 
	double DiscountPercentage=30;
	double DiscountAmount;
	double finalprice;
	
	void  DispayAllDetails() {
		
		System.out.println("BookId:"+BookId);
		System.out.println("BookTitle:"+BookTitle);
		System.out.println("BookAuthor:"+BookAuthor);
		System.out.println("Price:"+Price);
		System.out.println("DiscountPercentage:"+DiscountPercentage);
		
		DiscountAmount=Price/DiscountPercentage;
		System.out.println("DiscountAmount:"+DiscountAmount);
		finalprice=DiscountPercentage+DiscountAmount;
		System.out.println("finalprice:"+finalprice);
	}
	
	
	
	public static void main(String[] args) {
		Book b1=new Book();
		b1. DispayAllDetails();
		
		
	    b1. BookId=101;
		b1.BookTitle="java";
		b1.BookAuthor="Srikanth sir";
		b1. Price=200; 
		b1.DiscountPercentage=30;
		
	}

}



