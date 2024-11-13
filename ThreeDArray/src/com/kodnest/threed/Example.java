package com.kodnest.threed;

public class Example {

	public static void main(String[] args) {
		int[][][] matrix = {
				{
	            {3, 4, 5, 7},{8, 9, 11, 13}
	        },
			{
	        	{40,50,60},{80,90,70}
			},
	        {
	        	{20,30,40},{25,35,45}
	        }

	};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				for(int k=0;k<matrix[i][j].length;k++) {
					System.out.print(matrix[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
