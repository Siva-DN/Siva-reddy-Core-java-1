package com.jdbcpack.dao;

import com.jdbc.model1.Student1;
import com.jdbcpack.JdbcConnect1;


public class MainClassExample1 {

	public static void main(String[] args) {

		JdbcConnect1 jc = new JdbcConnect1();
		
		Student1 s=new Student1();
		
		s.setSname("Sandhya");
		s.setMarks(90);
		s.setPhone(897884599L);

		jc.insert(s);
		
		jc.selectAll();
		
	}

}
