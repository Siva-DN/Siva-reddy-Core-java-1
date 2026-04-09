package com.collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeDriver1 {

	public static void main(String[] args) {
		
		
		Employe1 e1=new Employe1(1,"siva",23);
		Employe1 e2=new Employe1(2,"Rohit",24);
		Employe1 e3=new Employe1(3,"sree",25);
		Employe1 e4=new Employe1(4,"gopi",20);
		
		
		List<Employe1> list=new ArrayList<>();
		
		list.add(e4);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		
		
		Comparator<Employe1> e=new Comparator<Employe1>(){

			@Override
			public int compare( Employe1 o1, Employe1 o2) {
				if(o1.empage<0) {
					return -1;
				}else if(o1.empage>o2.empage) {
					return 1;
				}else {
				return 0;
			}
		
			}
		};
		
		Collections.sort(list, e);;
		
		for(Employe1 emp:list) {
			System.out.println(emp);
			
		}
		
		
		
	}

}
