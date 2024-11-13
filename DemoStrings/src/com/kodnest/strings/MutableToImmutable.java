package com.kodnest.strings;

public class MutableToImmutable {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("hello");
//		StringBuffer s = new StringBuffer("hi");
		String str = new String(s);
		System.out.println(str);

	}

}
