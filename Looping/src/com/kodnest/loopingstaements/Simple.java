package com.kodnest.loopingstaements;

public class Simple {

	public static void main(String[] args) {
		// Number of rows for the pattern

		for (int i = 1; i <= 4; i++) {

		for (int j = 1; j<= i; j++) {
			System.out.print(" ");
		}
		for(int k=4;k>=i;k--) {
			System.out.print("*");

//		if (j==2 || j==4) {
//
//		System.out.print("#");
//
//		} else {
//
//		System.out.print("*");
//
//		}

		}

		System.out.println();
		}

	}

}
