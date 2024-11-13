package com.kodnest.loopingstaements;

public class Test3 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			
				for(int j=1;j<=i;j++) {
				System.out.print("*");
				}
				int s= 2*(n-i);
				for(int j=10;j<=s;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=s;k++) {
					System.out.print("?");
				}
			
			
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k>=i;k--) {
				System.out.print("*");
			}
			int s= 2*(n-i);
			
				for(int j=1;j<=s;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=s;k++) {
					System.out.print("&");
				}
			
			System.out.println();
		}

	}

}
