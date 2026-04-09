package com.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverProduct1 {

	public static void main(String[] args) {
		
		List<Integer> li= new ArrayList<>();
		
		li.add(5);
		li.add(4);
		li.add(2);
		li.add(1);
		li.add(3);
		
		Collections.sort(li);
		
		
		for(Integer i:li) {
			System.out.println(i);
		}
		
		
		
		Product1 p4=new Product1(104,"s4",50000.0);
		Product1 p1=new Product1(101,"Iphone",10000.0);
		Product1 p2=new Product1(102,"IQ",75000.0);
		Product1 p3=new Product1(103,"vivo t4",24000.0);
		
		
		List<Product1> list=new ArrayList<>();
		
		
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p1);
		
		
		
		
//The method sort(List<T>) in the type Collections is not applicable 
//for the arguments (List<Product1>)		
// Collections.sort(list);
		
		Collections.sort(list);
		
		for(Product1 p:list) {
			System.out.println(p);
			
		}
		
	   
		
		}

}
