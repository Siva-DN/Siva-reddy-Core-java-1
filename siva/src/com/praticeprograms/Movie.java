package com.praticeprograms;

//constructor-chaining
public class Movie {

	String title;
	String director;
	double rating;

	Movie() {
		this("title");
		System.out.println("noarg constructed called");
//		this("title");

	}

	Movie(String title) {
		this("title", "director");

		System.out.println("one arg constr called");

	}

	Movie(String title, String director) {
		this("rrr", "rajamouli", 5.0);
		System.out.println("two arg constr called");
	}

	Movie(String title, String director, double rating) {
		System.out.println("three arg constr called");
		this.title = title;
		this.director = director;
		this.rating = rating;
	}

	void display() {
		System.out.println("title:" + title);
		System.out.println("director:" + director);
		System.out.println("rating:" + rating);
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Movie m1 = new Movie();
		m1.display();
	}

}
