package com.kodnest.TwoDArray;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] n = Arrays.copyOf(m, m.length);
		System.out.println(Arrays.toString(n));

	}

}
