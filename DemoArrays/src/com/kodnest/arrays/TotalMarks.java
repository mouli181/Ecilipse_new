package com.kodnest.arrays;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of students");
		int n = s.nextInt();
		
		int m[] = new int[n];
		System.out.println("Enter the Test marks of" + n + "students");
		for(int i=0;i<m.length;i++) {
			m[i] = s.nextInt();
		}
		System.out.println("The test marks of " + n + "students marks total is");
		for(int i=0;i<m.length;i++) {
			sum = sum + m[i];
		}
		System.out.println(sum);
	}
}