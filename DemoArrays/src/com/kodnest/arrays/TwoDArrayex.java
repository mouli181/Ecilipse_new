package com.kodnest.arrays;

import java.util.Scanner;

public class TwoDArrayex {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the classes");
		int classes = s.nextInt();
		System.out.println("Enter the students");
		int students = s.nextInt();
		
		int[][] m = new int[classes][students];
		
//		m[a][b] = 50;
//		m[a][b] = 60;
//		m[a][b] = 70;
//		
//		m[a][b] = 80;
//		m[a][b] = 90;
//		m[a][b] = 55;  
//		
//		m[a][b] = 54;
//		m[a][b] = 53;
//		m[a][b] = 52;
		System.out.println("Please enter the marks of " + classes + "students present in " + students + "classes");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]= s.nextInt();
			}
		
		}
		System.out.println("The marks of " + classes + "students present in " + students + "classes are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		
		}
		
	}

}
