package com.kodnest.arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int[] b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));

	}

}
