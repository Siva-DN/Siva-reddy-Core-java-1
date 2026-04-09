package com.collection1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionClass1 {

	public static void main(String[] args) {

		// Collection is a raw type.
		// References to generic type Collection<E> should be parameterized.
		Collection<Object> c = new ArrayList<>();

		c.add(20);
		c.add("Siva");
		c.add(true);

		System.out.println(c + " ");

		Collection<String> customer = new ArrayList<>();

		customer.add("Siva");
		customer.add("Phani");
		customer.add("ramu");
		customer.add("Santhosh");

		System.out.println(customer);

		Collection<String> employee = new ArrayList<>();

		employee.add("Sree");
		employee.add("siri");
		employee.add("nandhu");
		employee.add("Siri");
		employee.add("Siva");
		
		
		customer.retainAll(employee);
		System.out.println("retainAll:"+customer);

		Collection<String> company = new ArrayList<>();

		company.addAll(customer);
		company.addAll(employee);

		employee.clear();
		System.out.println(employee);

		System.out.println(company);

		System.out.println(company.contains("Sree"));
		System.out.println(company.containsAll(employee));
		
		company.add("swathi");

		System.out.println("***************************");
		Collection<String> software = new ArrayList<>();
		software.add("Windows");

		System.out.println(company.containsAll(software));

	}

}
