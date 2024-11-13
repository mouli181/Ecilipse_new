package com.kodnest.threed;

import java.util.Scanner;

public class EvenIndexElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size");
		int a = s.nextInt();
		System.out.println("Enter the column size");
		int b = s.nextInt();
		System.out.println("Enter the column value size");
		int c = s.nextInt();
		
		int[][][] m = new int[a][b][c];

		System.out.println("Please enter the row and column values");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
				m[i][j][k]= s.nextInt();
				}
			} 
		
		}
		System.out.println("The even index elemnts of given array is");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				for(int k=0;k<m[i][j].length;k++) {
					if(k % 2 == 0) {
						System.out.print(m[i][j][k] + " ");
					}
				}
			}
			System.out.println();
		
		}

	}

}
