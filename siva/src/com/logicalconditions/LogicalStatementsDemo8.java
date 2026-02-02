package com.logicalconditions;

import java.util.Scanner;

//
//WAP to check the eligibility for a resume Short-listed and 
//Write a simple Nau-kari platform HR discussion console based APP
public class LogicalStatementsDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println(" Hi Good moring !!Enter your full name: ");
		String name = sc.nextLine();
		System.out.println("hello mr:" + name);

		System.out.println(" your education qualification: ");
		String qualify = sc.next();

		if (qualify.equals("mca") || qualify.equals( "cse")) {
			System.out.println("okay!! we go for next question");
			System.out.println("Which year you are passedout:");
			
			int passout = sc.nextInt();
			if (passout == 2025 || passout == 2024) {
				System.out.println("okay it's good !!");

				System.out.println("which skills you have known:");
				String skills = sc.nextLine();
				if (skills == "Java" || skills == "Sql") {
					System.out.println("congrutuations !! we are looking for skills");

					System.out.println("Do you have done any project:");
					boolean projectstatus = sc.nextBoolean();
					if (projectstatus) {
						System.out.println("okay good !!");

						System.out.println("You have any carrergap:");
						boolean carrergap = sc.nextBoolean();
						if (carrergap) {
							System.out.println("okay its super !!");
							System.out.println("congrugulations you are selected");

						} else {
							System.out.println("ohh sorry rejected");
						}

					} else {
						System.out.println("rejected !!");
					}

				} else {
					System.out.println("Soory for this rejected!! ");
				}

			} else {
				System.out.println("Sorry !!rejected !!");
			}

		} else {
			System.out.println(" sorry !! you are rejected !!");
			sc.close();
		}
	

	}

}
