package com.constructorsprograms;

//copy constructor example using constructor chaining 
public class Cinemacopyconstr {

	String moviename;
	String hero;
	String heroine;
	double budget;
	String director;

	Cinemacopyconstr() {
		System.out.println("no-arg");
		hero = "mahi";
		heroine = "depikha";

	}

	Cinemacopyconstr(String hero) {
		this();// call the no_arg constructors
		this.hero = hero;
	}

	Cinemacopyconstr(Cinemacopyconstr h, String moviename, double budget) {
		this.moviename = moviename;
		this.budget = budget;
		this.hero = h.hero;
	}

	Cinemacopyconstr(Cinemacopyconstr c3, String heroine, String director) {
		this.moviename = c3.moviename;
		this.budget = c3.budget;
		this.hero = c3.hero;
		this.heroine = heroine;
		this.director = director;
	}

	void show() {
		System.out.println("**********");
		System.out.println("movie:" + moviename);
		System.out.println("hero:" + hero);
		System.out.println("heroine:" + heroine);
		System.out.println("budget:" + budget);
		System.out.println("director:" + director);
	}

	public static void main(String[] args) {

		Cinemacopyconstr c1 = new Cinemacopyconstr();
		c1.show();

		Cinemacopyconstr c2 = new Cinemacopyconstr("mouli");
		c2.show();

		Cinemacopyconstr c3 = new Cinemacopyconstr(c2, "ssmb29", 500000);
		c3.show();

		Cinemacopyconstr c4 = new Cinemacopyconstr(c3, "depikha", "mahi");
		c4.show();
	}

}
