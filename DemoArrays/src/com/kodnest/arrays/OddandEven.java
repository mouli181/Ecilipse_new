package com.kodnest.arrays;

import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}

	}

}
