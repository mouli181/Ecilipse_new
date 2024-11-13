package com.kodnest.datastructures;

import java.util.Scanner;

class Array{
	private int arr[];
	private Scanner s = new Scanner(System.in);
	
	public Array(int n) {
		arr = new int[n];
	}
	
	void insert() {
		System.out.println("Enter the position 0 from " + (arr.length-1));
		int pos = s.nextInt();
		
		System.out.println("Enter the element");
		int ele = s.nextInt();
		
		arr[pos] = ele;
	}
	
	void delete() {
		System.out.println("Enter the position to delete the elemen");
		int posi = s.nextInt();
		System.out.println("element deleted is " + arr[posi]);
		arr[posi] = 0;
	}
	
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}

public class ArrayApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int n = sc.nextInt();
		
		Array a = new Array(n);
		
		while(true) {
		System.out.println("Prees 1--------------INSERTING");
		System.out.println("Press 2--------------DELETION");
		System.out.println("Press 3--------------DISPLAY");
		System.out.println("Press other number for exiting");
		System.out.println("Enter the option");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: a.insert();
		break;
		case 2: a.delete();
		break;
		case 3: a.display();
		break;
		default : System.exit(0);
		}
		
	}

}
}