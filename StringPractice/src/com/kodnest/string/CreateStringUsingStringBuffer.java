package com.kodnest.string;

import java.util.Scanner;

public class CreateStringUsingStringBuffer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();

        String result = createStringFromCharArray(charArray);

        System.out.println("Created string: " + result);

    }

    public static String createStringFromCharArray(char[] charArray) {

        StringBuffer stringBuffer = new StringBuffer();

        for (char c : charArray) {

            stringBuffer.append(c);

        }

 

        return new String(stringBuffer);

	}

}
