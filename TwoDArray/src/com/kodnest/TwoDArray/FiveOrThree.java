package com.kodnest.TwoDArray;

import java.util.Scanner;

public class FiveOrThree {

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
		System.out.println("The Multiple of 5 or 3 row and column values are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if(m[i][j] % 5 ==0 || m[i][j] % 3==0) {
					System.out.print(m[i][j] + " ");
				}
			}
			System.out.println();
		
		}

	}

}
