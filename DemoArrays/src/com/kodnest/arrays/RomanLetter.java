package com.kodnest.arrays;

import java.util.Scanner;

class RomanLetter {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);

	     

		    // Reading input value
		 	System.out.println("Enter the value");

		    String romanNumeral = scanner.nextLine();

		     

		    // Converting Roman numeral to integer and displaying the result

		    int result = romanToInt(romanNumeral);

		    System.out.println(result);

		  }



		  private static int romanToInt(String s) {

		    int result = 0;

		    int prevValue = 0;



		    for (int i = s.length() - 1; i >= 0; i--) {

		      int currentValue = getValue(s.charAt(i));

		       

		      if (currentValue < prevValue) {

		        result -= currentValue;

		      } else {

		        result += currentValue;

		      }



		      prevValue = currentValue;

		    }



		    return result;

		  }



		  private static int getValue(char romanSymbol) {

		    switch (romanSymbol) {

		      case 'I':

		        return 1;

		      case 'V':

		        return 5;

		      case 'X':

		        return 10;

		      case 'L':

		        return 50;

		      case 'C':

		        return 100;

		      case 'D':

		        return 500;

		      case 'M':

		        return 1000;

		      default:

		        return 0;

		    }

	}

}
