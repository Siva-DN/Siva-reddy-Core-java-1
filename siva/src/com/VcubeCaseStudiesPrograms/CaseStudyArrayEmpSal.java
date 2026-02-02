package com.VcubeCaseStudiesPrograms;

import java.util.Scanner;

/* using an array of employee income salary,,the program must identify the Highest salary,Lowest salary,sum,Average salary
 * and determine which employee fall into lower and higher earnings groups.? */
public class CaseStudyArrayEmpSal {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		// Step--1
		// read the number of employees..
		System.out.println("enter the numbers of employee..");
		int a = sc.nextInt();

		// Step--2
		// create an array to store the employee salary..
		double[] salary = new double[a];

		for (int i = 0; i < a; i++) {
			System.out.println("enter the salary based on the array size");
			salary[i] = sc.nextDouble();
		}

		// Step--4:
		// Initialize the salary like highest,lowest,sum,avg..
		double highsal = salary[0];
		double lowsal = salary[0];
		double sum = 0;

		// calculate the high,low,sum,average salary logic...?
		for (int i = 0; i < a; i++) {
			if (salary[i] > highsal) {
				highsal = salary[i];
			}
			if (salary[i] < lowsal) {
				lowsal = salary[i];
			}
			sum = sum + salary[i];
		}

		double avg = sum / a;

		int lowcount = 0;
		int highcount = 0;

		for (int i = 0; i < a; i++) {
			if (salary[i] < avg) {
				lowcount++;
			} else {
				highcount++;
			}

		}
		// Representing the salaries..
		System.out.println("highest salary:" + highsal);
		System.out.println("lowest salary:" + lowsal);
		System.out.println("total sum  salary:" + sum);
		System.out.println("average salary:" + avg);
		System.out.println("highest salary:" + highcount);
		System.out.println("highest salary:" + lowcount);

		sc.close();
	}
}
