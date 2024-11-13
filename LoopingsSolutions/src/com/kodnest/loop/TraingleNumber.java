package com.kodnest.loop;

public class TraingleNumber {

	public static void main(String[] args) {

	        for (int i = 1; i <= 6; i++) {

	            // Print spaces

	            for (int j = 1; j < i; j++)

	                System.out.print(" ");

	            // Print numbers in increasing order

	            for (int j = i; j <= 6; j++)

	                System.out.print(j + " ");

	            System.out.println();

	        }

	}

}
