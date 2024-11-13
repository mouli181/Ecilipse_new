package com.kodnest.TwoDArray;

import java.util.Scanner;

public class OddElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size");
		int a = s.nextInt();
		System.out.println("Enter the column size");
		int b = s.nextInt();
		
		int[][] m = new int[a][b];

		System.out.println("Please enter the row and column values");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				m[i][j]= s.nextInt();
			}
		
		}
		System.out.println("The odd elemnts of given array is");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j] % 2 != 0) {
				System.out.print(m[i][j] + " ");
				}
			}
			System.out.println();
		
		}

	}

}
