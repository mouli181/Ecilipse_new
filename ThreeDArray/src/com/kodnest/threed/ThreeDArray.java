package com.kodnest.threed;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student1 marks");
		int stu1 = s.nextInt();
		System.out.println("Enter the student2 marks");
		int stu2 = s.nextInt();
		System.out.println("Enter the student3 marks");
		int stu3 = s.nextInt();
		
		int[][][] a = new int[stu1][stu2][stu3];
		
		System.out.println("Enter the marks of students");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					a[i][j][k]= s.nextInt();
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + " ");
				}
			}
			System.out.println();
		}

	}

}
