package com.kodnest.strings;

public class SubstringwithoutDisplay {

	public static void main(String[] args) {
		String s = "Mouli";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				for(int k=i;k<j;k++) {
				System.out.print(s.charAt(k));
			}
				System.out.println();
			}
		}

	}

}
