package com.kodnest.TwoDArray;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row size");
		int n = s.nextInt();
		System.out.println("Enter the column size");
		int k = s.nextInt();
		
		int m[][] = new int[n][k];
		System.out.println("enter the row and column values are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
			m[i][j] = s.nextInt();
		}}
		System.out.println("The sum of total value is");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
			sum = sum + m[i][j];
		}}
		System.out.println(sum);

	}

}
