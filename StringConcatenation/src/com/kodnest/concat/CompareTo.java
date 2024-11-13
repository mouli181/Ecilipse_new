package com.kodnest.concat;

public class CompareTo {

	public static void main(String[] args) {
		String s1 =new String( "Banana");
		String s2 =new String("Apple");
		System.out.println(s1.compareTo(s2));
		
		String s3 =new String( "Apple");
		String s4 =new String("Apple");
		System.out.println(s3.compareTo(s4));
		
		String s5 =new String( "Apple");
		String s6 =new String("Banana");
		System.out.println(s5.compareTo(s6));
		
		String s7 =new String( "Apple");
		String s8 =new String("Bpple");
		System.out.println(s8.compareTo(s7));
	}

}
