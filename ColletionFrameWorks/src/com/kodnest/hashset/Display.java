package com.kodnest.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Display {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String pl = s.nextLine();
		String[] str = pl.split(" ");
		
		HashSet hs = new HashSet();
		for(Object obj: str) {
			hs.add(obj);
		}
		System.out.println(hs);
		
		// For sorting order
		TreeSet ts = new TreeSet();
//		for(Object obj: str) {
//			ts.add(obj);
//		}
		ts.addAll(hs);
		System.out.println(ts);
	}

}
