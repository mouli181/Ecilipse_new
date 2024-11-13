package com.kodnet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Demo{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection infrormation
		String url = "jdbc:mysql://localhost/student";
		String username = "root";
		String password = "Mouli@1234";
		
		//Establishing connection
		Connection c = DriverManager.getConnection(url, username, password);

		

		String str = "insert into student values(?,?)";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.nextLine();
		
		System.out.println("Enter the age");
		int age = s.nextInt();
		
		Student st = new Student(name,age);
		String sname = st.getName();
		int sage = st.getAge();
		
		
		
		//Ceating the statment
		PreparedStatement p = c.prepareStatement(str);
		p.setString(1, sname);
		p.setInt(2,sage);
		
		int e = p.executeUpdate();
		
		if(e > 0) {
			System.out.println("Insertion Sucessfull");
		}
		else {
			System.out.println("Insertion Failiure");
		}

	}

}
