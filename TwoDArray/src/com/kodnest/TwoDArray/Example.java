package com.kodnest.TwoDArray;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		
		int[][] a= {{10,20},{50,30},{70,30}};
//		System.out.println("Please enter the row and column values");
//		for(int i=0;i<m.length;i++) {
//			for(int j=0;j<m[i].length;j++) {
//				m[i][j]= s.nextInt();
//			}
//		
//		}
		//System.out.println("The row and column values are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==2) {
				System.out.print(a[i][j] + " ");
			}}
			//System.out.println();
		
		}

	}
}

