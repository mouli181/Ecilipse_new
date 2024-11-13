package com.kodnest.programming;

import java.util.Scanner;

public class Application7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Semester1 Mark");
		int sem1 = scan.nextInt();
		System.out.println("Enter the Semester2 Mark");
		int sem2 = scan.nextInt();
		System.out.println("Enter the Semester3 Mark");
		int sem3 = scan.nextInt();
		System.out.println("Enter the Semester4 Mark");
		int sem4 = scan.nextInt();
		System.out.println("Enter the Semester5 Mark");
		int sem5 = scan.nextInt();
		System.out.println("Enter the Semester6 Mark");
		int sem6 = scan.nextInt();
		System.out.println("Enter the Semester7 Mark");
		int sem7 = scan.nextInt();
		System.out.println("Enter the Semester8 Mark");
		int sem8 = scan.nextInt();
		Question7 obj = new Question7();
		double result = obj.calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
		System.out.println("The Average of marks is " + result);
	}

}
