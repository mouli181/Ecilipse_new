package com.kodnest.hackerrank;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
		int i = 4;
		double d = 4.0;
		String str = "Kodnest ";
		
		Scanner s = new Scanner(System.in);
		int j = s.nextInt();
		
		double e = s.nextDouble();
		
		s.nextLine();
		
		String st = s.nextLine();
		
		
		
		System.out.println(i+j);
		System.out.println(d+e);
		System.out.println(str.concat(st));
		
	}

}
