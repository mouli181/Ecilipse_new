 //package com.kodnet.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class CreateTable {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		System.out.println("Hello");
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		//connection infrormation
//		String url = "jdbc:mysql://localhost/kodnest";
//		String username = "root";
//		String password = "Mouli@1234";
//		
//		//Establishing connection
//		Connection c = DriverManager.getConnection(url, username, password);
////		
//		//executing sql statement
//		Statement st = c.createStatement();
//		st.execute("create table student(id int, name varchar(20))");
//		System.out.println("success");
//	}
//
//}
