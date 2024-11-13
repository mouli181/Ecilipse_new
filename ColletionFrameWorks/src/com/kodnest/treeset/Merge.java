package com.kodnest.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Merge {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String pl = s.nextLine();
		String[] str = pl.split(" ");
		
		String pl2 = s.nextLine();
		String[] str2 = pl2.split(" ");

		TreeSet hs = new TreeSet();
		
		for(Object obj: str) {
			hs.add(obj);
		}
		for(Object obj: str2) {
			hs.add(obj);
		}
		
		System.out.println(hs);
		
	}

}
