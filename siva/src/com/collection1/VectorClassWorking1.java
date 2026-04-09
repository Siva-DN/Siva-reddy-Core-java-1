package com.collection1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClassWorking1 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>(10);

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		System.out.println(v);

        //Legacy class version 1.0 will came
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());

		}

		System.out.println("**********************");

		// modern class version 1.2 came
		Iterator<Integer> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println(v.size());
	}

}
