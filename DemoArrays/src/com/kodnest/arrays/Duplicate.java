package com.kodnest.arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");
		
		int[] num = new int[str.length];
		
		for(int i=0;i<str.length;i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		int result = removeDuplicate(num);
		System.out.println(result);
	}
	public static int removeDuplicate(int[] num) {
		if(num.length == 0) {
			return 0;
		}
		
		int uniqueCount = 1;
		for(int i=1;i<num.length;i++) {
			 if (num[i] != num[i - 1]) {

			        num[uniqueCount++] = num[i];

			      }
		}
		return uniqueCount;
	}
}
