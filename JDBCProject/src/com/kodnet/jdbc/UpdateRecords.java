package com.kodnet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecords {

	public static void updateRecords() throws ClassNotFoundException, SQLException {
		//System.out.println("Hello");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection infrormation
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Mouli@1234";
		
		//Establishing connection
		Connection c = DriverManager.getConnection(url, username, password);
		
		//executing sql statement
//		Statement st = c.createStatement();
//		
//		String str = "update student set name='Laishu' where id=5";
//		int executeUpdate = st.executeUpdate(str);
//		
//		System.out.println("success - " + executeUpdate);
		
		String str = "update student set name=? where id=?";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id value where name to be updated");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("Enter the name name to set");
		String name = s.nextLine();
		
		//Ceating the statment
		PreparedStatement p = c.prepareStatement(str);
		p.setInt(2, id);
		p.setString(1,name);
		
		int e = p.executeUpdate();
		if(e > 0) {
			System.out.println("Updation Sucessfull");
		}
		else {
			System.out.println("Updation Failiure");
		}
		

	}

}

