package com.kodnest.strings;

public class SentenceWordsReverse {

	public static void main(String[] args) {
		String str = "Hello java program";
		String[] split = str.split(" ");
		for(int i=0;i<split.length;i++) {
			StringBuffer s = new StringBuffer(split[i]);
			System.out.print(s.reverse()+" ");
		}
	}

}
