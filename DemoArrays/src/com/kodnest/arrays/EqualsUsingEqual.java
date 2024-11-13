package com.kodnest.arrays;

import java.util.Arrays;

public class EqualsUsingEqual {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		boolean c = Arrays.equals(a, b);
		System.out.println(c);
	}

}
