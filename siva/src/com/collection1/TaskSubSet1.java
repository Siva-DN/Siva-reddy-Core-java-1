package com.collection1;

//Check if a Set is a Subset of Another Set
//Create a method that takes two Sets of integers as input and returns true if the first set is a subset of the second set.

//Example:
//set1 = [1, 2, 3], set2 = [1, 2, 3, 4, 5]: true
//set1 = [1, 2, 6], set2 = [1, 2, 3, 4, 5]:False 



import java.util.HashSet;
import java.util.Set;

public class TaskSubSet1 {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 2, 3, 4,5 };

		boolean subset = true;
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();

		for (int n : a1) {
			s1.add(n);

		}

		for (int n : a2) {
			s2.add(n);

		}
		for (Integer n1 : s2) {
			if (!s1.contains(n1)) {
				subset = false;
			}
		}

		if (subset) {
			System.out.println("s2 is subset of s1");
		} else {
			System.out.println("s2 is not-subset of s1 ");
		}

	}

}
