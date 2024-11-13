package com.kodnet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {

	public static void insertRecords() throws ClassNotFoundException, SQLException {
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
//		Statement st = c.createStatement();
//		
//		String str = "insert into student values(5,'laishnavi')";
//		st.execute(str);
//		
//		System.out.println("success");
		

		String str = "insert into student values(?,?)";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("Enter the name");
		String name = s.nextLine();
		
		//Ceating the statment
		PreparedStatement p = c.prepareStatement(str);
		p.setInt(1, id);
		p.setString(2,name);
		
		int e = p.executeUpdate();
		if(e > 0) {
			System.out.println("Insertion Sucessfull");
		}
		else {
			System.out.println("Insertion Failiure");
		}
	}

}
