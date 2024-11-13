package com.kodnest.loop;

public class Traingle {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
						
			System.out.println();
		}
		 

	}

}
