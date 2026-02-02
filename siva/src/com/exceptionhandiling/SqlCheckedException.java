package com.exceptionhandiling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlCheckedException {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started !!");
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
//      Step1  :Loading the SQL Driver Class.

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded successfully !!");

//      Step2  :Establish the Database Connection.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vcubesoftware", "root", "root");

			System.out.println("Successfully connecting to the database");

			PreparedStatement ps1 = con.prepareStatement("update emp set salary=? where  empno=?");

			ps1.setDouble(1, 50000);
			ps1.setInt(2, 3);

			ps1.executeUpdate();
			
			PreparedStatement ps2 = con.prepareStatement("update emp set salary=?,ename=? where  empno=?");
			ps2.setDouble(1, 60000);
			ps2.setString(2, "Dhoni");
			ps2.setInt(3, 2);
			
			ps2.executeUpdate();
			
			PreparedStatement ps3 = con.prepareStatement("delete from emp  where  empno=?");
			
			ps3.setInt(1, 4);
			ps3.executeUpdate();

//      Step3  :Create a Statement object to communicate with database.

			st = con.createStatement();
//      Step4  :Create a ResultSet to Read the Data.
			rs = st.executeQuery("select*from emp");
//			rs=st.executeUpdate("select * from emp where empid=101 ");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "");
				System.out.print(rs.getString(2) + "");
				System.out.print(rs.getString(3) + "");
				System.out.println("******************");

			}

//      Step5  :Close the connections.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			rs.close();
			st.close();
		}
		System.out.println("main method ended !!");
	}

}
