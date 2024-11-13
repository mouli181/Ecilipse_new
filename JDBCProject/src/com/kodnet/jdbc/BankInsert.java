package com.kodnet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Hello");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection infrormation
		String url = "jdbc:mysql://localhost/kodnest";
		String username = "root";
		String password = "Mouli@1234";
		
		String str1 = "update bank set balance = balance+40000 where acc_no=1";
		String str2 = "update bank set balance = balance-5000 where acc_no=5";
		Connection c = null;
		
		try {
		//Establishing connection
		c = DriverManager.getConnection(url, username, password);
		c.setAutoCommit(false);
		//executing sql statement
		Statement st = c.createStatement();
		
		//String str = "insert into bank values(2,'ranjith',15000),(3,'sachin',25000),(4,'Pavan',10000),(5,'Hari',35000)";
		
//		String str1 = "insert into bank values(2,'ranjith',15000)";
//		String str2 = "insert into bank values(2,'ranjith',15000)";
		
		
		st.addBatch(str1);
		st.addBatch(str2);
		
		st.executeBatch();
		c.commit();
		}
		catch(Exception e) {
			c.rollback();
		}
		System.out.println("success");
	}

}

