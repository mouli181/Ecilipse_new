package com.kodnestdisfferentpatterns;

public class TenStar {

	public static void main(String[] args) {
		for(int i=10;i<=40;i=i+10) {
			for(int j=10;j<=i;j=j+10) {
				if(i==j) {
					System.out.print(j + " ");
				}
				else {
					System.out.print(j+ "*");
				}
				
			}
			System.out.println();
		}

	}

}
