package com.collection1;

import java.util.ArrayList;
import java.util.List;

public class ListDuplicateElements {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		l1.add(1);
		l1.add(2);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(4);
		l1.add(4);
		l1.add(5);

//		System.out.println(l1);

		boolean[] arr = new boolean[l1.size()];
		for (int i = 0; i < l1.size(); i++) {
			int count=0;

			for (int j = i + 1; j < l1.size(); j++) {
				if (l1.get(i).equals(l1.get(j))) {
					count++;
				}

			}
			if(count==1) {
				System.out.println(l1.get(i)+" ");
			}
		}
	}
	

}
