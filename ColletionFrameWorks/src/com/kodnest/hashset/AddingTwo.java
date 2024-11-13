package com.kodnest.hashset;


import java.util.HashSet;
import java.util.Scanner;

public class AddingTwo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String pl = s.nextLine();
		String[] str = pl.split(" ");
		
		String pl2 = s.nextLine();
		String[] str2 = pl2.split(" ");
		
		HashSet hs = new HashSet();
		
		for(Object obj: str) {
			hs.add(obj);
		}
		for(Object obj: str2) {
			hs.add(obj);
		}
		
		System.out.println(hs);
	}

}
//package com.kodnest.hashset;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class AddingTwo {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		ArrayList al = new ArrayList();
//		
//		
//		String pl = s.nextLine();
//		String[] str = pl.split(" ");
//		
//		for(Object o : str ) {
//			al.add(o);
//		}
//		
//		String pl2 = s.nextLine();
//		String[] str2 = pl2.split(" ");
//		
//		for(Object o : str2 ) {
//			al.add(o);
//		}
//		
//		HashSet hs = new HashSet();
//		
//		for(Object obj: str) {
//			hs.add(obj);
//		}
//		for(Object obj: str2) {
//			hs.add(obj);
//		}
//		
//		System.out.println(hs);
//	}
//
//}
