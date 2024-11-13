package com.kodnest.datastructures;

import java.util.Scanner;

class Stack1{
	private int s[];
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);
	
	public Stack1(int n) {
		s = new int[n];
		size = s.length;
	}
	public void push() {
		int elem;
		if(top == size-1) {
			System.out.println("Push not possible");
		}
		else {
			System.out.println("Enter the element");
			elem = scan.nextInt();
			++top;
			s[top] = elem;
		}
	}
	public void pop() {
		if(top == -1) {
			System.out.println("Pop not possible");
		}
		else {
			System.out.println("element deleted is " + s[top]);
			--top;
		}
	}
	public void display() {
		if(top == -1) {
			System.out.println("Display not possible");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(s[i]);
			}
		}
	}
}
public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stack size");
		int n = sc.nextInt();
		Stack1 s = new Stack1(n);
		while(true) {
			System.out.println("Press-1-------push");
			System.out.println("Press-2-------pop");
			System.out.println("Press-3-------display");
			System.out.println("Press any other number for stop");
			System.out.println("Enter the number");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : s.push();
			break;
			case 2 : s.pop();
			break;
			case 3 : s.display();
			break;
			default : System.exit(0);
			}
		}

	}

}
