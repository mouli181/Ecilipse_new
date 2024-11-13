package com.kodnet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayRecords {

	public static void displayRecords() throws ClassNotFoundException, SQLException {
		//System.out.println("Hello");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection infrormation
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Mouli@1234";
		
		//Establishing connection
		Connection c = DriverManager.getConnection(url, username, password);
//		
		//executing sql statement
		Statement st = c.createStatement();
		
		String str = "select * from student";
		
		ResultSet rs = st.executeQuery(str);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
		}
	}

}


