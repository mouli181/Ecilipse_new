package com.kodnest.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Mouli@1234";
		//String sql = "delete from employee where id=?";
		String sql = "select * from employee where id=1";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id where to be deleted");
//		int id = sc.nextInt();
		
		Connection c = DriverManager.getConnection(url,username,password);
		
		
		//String sql="insert into employee values(2,'ranjith')";
		//String sql = "Create table product(id int, pname varchar(20))";
		
		//String sql = "update employee set name='louli' where id=1";
		
		Statement s = c.createStatement();
		//PreparedStatement s = c.prepareStatement(sql);
		//s.setInt(1,id);
		
		ResultSet rs = s.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
		}
		System.out.println("success");
		
	}

}
