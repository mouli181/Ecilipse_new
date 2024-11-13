package com.kodnest.loop;

public class Side {

	public static void main(String[] args) {

	        int n = 10;

	 

	        // Upper part of the rhombus

	        for (int i = 1; i <= n; i++) {

	            // Print spaces

	            for (int j = 1; j <= n - i; j++)

	                System.out.print(" ");

	 

	            // Print stars for the first and last rows, or for the first and last columns

	            for (int j = 1; j <= n; j++) {

	                if (j == 1 || j == n || i == 1 || i == n)

	                    System.out.print("*");

	                else

	                    System.out.print(" ");

	            }

	 

	            System.out.println();

	        }

	 

	        // Lower part of the rhombus

	        for (int i = n - 1; i >= 1; i--) {

	            // Print spaces

	            for (int j = 1; j <= n - i; j++)

	                System.out.print(" ");

	 

	            // Print stars for the first and last rows, or for the first and last columns

	            for (int j = 1; j <= n; j++) {

	                if (j == 1 || j == n || i == 1 || i == n)

	                    System.out.print("*");

	                else

	                    System.out.print(" ");

	            }

	 

	            System.out.println();

	        }

	}

}
