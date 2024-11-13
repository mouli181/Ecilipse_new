package com.kodnet.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
		
		System.out.println("Application Stared");
		System.out.println("------------------");
		while(true) {
		System.out.println("Do you want to");
		System.out.println("1.Insert the record");
		System.out.println("2.Update the record");
		System.out.println("3.Delete the record");
		System.out.println("4.Exit");
		
		Thread.sleep(500);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the option");
		int option = s.nextInt();
		
		switch(option) {
		case 1: InsertRecords.insertRecords();
		DisplayRecords.displayRecords();
		break;
		case 2: UpdateRecords.updateRecords();
		DisplayRecords.displayRecords();
		break;
		case 3: DeleteRecords.deleteRecords();
		DisplayRecords.displayRecords();
		break;
		case 4: System.out.println("Application ended");
			System.exit(0);
		break;
		
		default: System.out.println("Invalid Option");
		break;
		}
		}	

	}

}
