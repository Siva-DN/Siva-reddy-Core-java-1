package com.praticeprograms;

import java.util.Scanner;

public class FahrenheittHeatExamplee {

	int celcius = 50;

	double Fahrenheit = (celcius * 9 / 5) + 32;

	double f = 122;

	int celcius2 = (int) (f - 32) * 5 / 9;

	void total() {
		System.out.println("FahrenheittHeat:" + Fahrenheit);
		System.out.println("celciustHeat:" + celcius);

	}

	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);

		FahrenheittHeatExamplee f1 = new FahrenheittHeatExamplee();

		f1.total();

	}

}
