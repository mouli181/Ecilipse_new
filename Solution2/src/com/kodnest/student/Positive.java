package com.kodnest.student;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		if(a>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Not Positive");
		}

	}

}
