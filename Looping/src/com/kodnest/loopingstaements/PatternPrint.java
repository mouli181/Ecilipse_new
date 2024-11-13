package com.kodnest.loopingstaements;

public class PatternPrint {

	public static void main(String[] args) {
		
		         // Number of rows in the pattern

		        for (int i = 1; i <= 3; i++) {
		            // Print '_' characters
		            for (int j = 1; j <=i; j++) {
		                System.out.print("_");
		            }

		            // Print '*' characters
		            for (int k = 4; k>=i; k--) {
		            	
		                System.out.print("*");
		            }

		            // Move to the next line
		            System.out.println();
		        }
		    }
		}

	


