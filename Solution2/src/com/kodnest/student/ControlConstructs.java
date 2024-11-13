package com.kodnest.student;

import java.util.Scanner;

public class ControlConstructs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int a = scan.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
		
	}

}
 