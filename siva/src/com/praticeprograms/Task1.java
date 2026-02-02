package com.praticeprograms;

import java.util.Scanner;

/* 1. Write a Java program to perform the following tasks:
Print all upper-case alphabets (A to Z) and lower-case alphabets (a to z).
Print each Upper-case alphabet (A to Z) along with its corresponding position number (A 1, B 2, C 3, …, Z 26).
Output : 
Upper-case Alphabets (A to Z):
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Lower-case Alphabets (a to z):
a b c d e f g h i j k l m n o p q r s t u v w x y z
Alphabets with Numbers:
A -> 1
B ->2
C -> 3
...
Z -> 26
*/
public class Task1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Letter:");

		int d = 'A' / 'A';

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i + "--> " + d++);

		}
		int e = 'a' / 'a';
		for (char j = 'a'; j <= 'z'; j++) {
			System.out.println(j + "--> "+e++);
		}

	}

}
