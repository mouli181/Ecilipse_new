package com.kodnest.string;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the string");
		String s = sc.nextLine();
		
		String result = findLongest(s);
		System.out.println(result);
	}
	public static String findLongest(String s) {
		
        String[] word = s.split(" ");
        String maxlethWord = "";
        for(int i = 0; i < word.length; i++){
        	if(word[i].length() >= maxlethWord.length()){
               maxlethWord = word[i];
        	} 
        }
        return maxlethWord; 

	}

}
