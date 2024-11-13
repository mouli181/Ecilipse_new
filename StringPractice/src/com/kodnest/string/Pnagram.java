package com.kodnest.string;
import java.util.Scanner;
public class Pnagram {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  String input = scanner.nextLine();
		  boolean isPangram = checkPangram(input.toLowerCase());

	        if (isPangram) {
	            System.out.println("The given string is a pangram.");
	        } else {
	            System.out.println("The given string is not a pangram.");
	        }
	        scanner.close();
	    }
	public static boolean checkPangram(String str){
	    if(str.length()<26){
	        return false;
	    }

	    boolean[] mark = new boolean[26];
	    int index;

	    for(int i=0;i<str.length();i++){
	        char c = str.charAt(i);
	        if('a' <= c && c<='z'){
	            index = c - 'a';
	            mark[index] = true;
	        }
	    }
	    for(boolean value : mark){
	        if(!value){
	            return false;
	        }
	    }
	    return true;
	}
}
