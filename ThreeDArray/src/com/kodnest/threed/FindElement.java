package com.kodnest.threed;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the deparment");
		int dep = s.nextInt();
		System.out.println("Enter the students count");
		int stu = s.nextInt();
		System.out.println("Enter the marks of student");
		int mark = s.nextInt();
		
		int[][][] m = new int[dep][stu][mark];
		System.out.println("Enter the each student mark");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
					m[i][j][k] = s.nextInt();
				}
			}
		}
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
					System.out.print(m[0][1][2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
