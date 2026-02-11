package com.jdbcpack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.model1.Student1;
import com.jdbcpack.dao.JdbcMainInterface1;
import com.jdbcpack.utility.MainDBConnectionClass;

public class JdbcConnect1 implements JdbcMainInterface1{
	Connection con;
	MainDBConnectionClass mdb=null;

	public void insert(Student1 s) {

		try {

			mdb = new MainDBConnectionClass();

			con = mdb.getConnection();

			// create a statement
			// Statement st = con.createStatement();

			PreparedStatement ps = con.prepareStatement("insert into student(sname,marks,phone) values(?,?,?)");
			ps.setString(1, s.getSname());
			ps.setInt(2, s.getMarks());
			ps.setLong(3, s.getPhone());

			int n = ps.executeUpdate();

			// Execute
//			int n = st.executeUpdate("insert into student(sname,marks) values('sree',95)");

			if (n > 0) {
				System.out.println(n + "row affected");
			} else {
				System.out.println("something wrong !!");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void selectAll() {

		try {

			mdb = new MainDBConnectionClass();
			con = mdb.getConnection();

			PreparedStatement ps = con.prepareStatement("select *from student");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("sno") + ":" + rs.getString("sname") + " :" + rs.getInt("marks") + " ");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
