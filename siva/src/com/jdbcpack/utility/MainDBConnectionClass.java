package com.jdbcpack.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainDBConnectionClass {

	Connection con = null;

	public Connection getConnection() {

		try {
			// Step 1: loading the driver from SQL database

			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2:Establish the connection to the database.

			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdjdbc", "root", "root");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
