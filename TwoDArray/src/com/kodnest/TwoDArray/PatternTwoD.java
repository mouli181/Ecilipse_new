package com.kodnest.TwoDArray;



public class PatternTwoD {

	public static void main(String[] args) {

		
		int[][] m = {{25,26,27,28,29},{20,22,23,24,24},{30,31,32,33,34},{10,11,12,13,14},{15,16,17,18,19}};
		
		
		System.out.println("The row and column values are");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The pattern is");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(i==1 ) {
				System.out.print(m[i][j] + " ");
			}}
			System.out.println();
		}

	}

}
