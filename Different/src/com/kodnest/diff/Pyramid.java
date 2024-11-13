package com.kodnest.diff;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
//		 for(int i=1;i<=6;i++){
//	            for(int j=5;j>=i;j--){
//	                System.out.print("  ");
//	            }
//	            for(int k=i;k>=1;k--){
//	                System.out.print(k + " ");
//	            }
//	            for(int m=2;m<=i;m++){
//	                System.out.print(m + " " );
//	            }
//	            System.out.println();
//	        }

		 Scanner scanner = new Scanner(System.in);

	        int n = 6;

	        for (int i = 1; i <= n; i++) {

	            // Print spaces

	            for (int j = 1; j <= n - i; j++)

	                System.out.print("  ");

	            // Print decreasing numbers

	            for (int j = i; j >= 2; j--)

	                System.out.print(j + " ");

	            // Print increasing numbers

	            for (int j = 1; j <= i; j++)

	                System.out.print(j + " ");

	            System.out.println();

	        }
	}

}
