package com.kodnest.loopingstaements;

public class Test2 {

	public static void main(String[] args) {  
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	} 

}
//for (int i = 1; i <= rows; i++) { for (int j = i; j >= 1; j--)
//{
//    System.out.print(j+" ");
//}