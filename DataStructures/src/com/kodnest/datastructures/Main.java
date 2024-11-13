package com.kodnest.datastructures;


import java.util.ArrayList;
import java.util.Scanner;

class MyStack{
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void push(int ele) {
		al.add(ele);
		System.out.println(ele + " pushed");
	}
	void pop() {
		
		if(al.isEmpty()) {
			 System.out.println("stack is empty");
		}else {
		Integer ele = al.remove(al.size()-1);
		System.out.println(ele + " removed");
		}
	}
	// al.isempty and al.size==0 both are same.it checking the stack is empty or not 
	void peek() {
		if(al.size()==0) {
			System.out.println("Stack is empty");
		}
		else {
		System.out.println(al.get(al.size()-1) + " peek sucess");
	}
	}
	void display() {
		if(al.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
		System.out.println(al);
		}
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		MyStack ms = new MyStack();
		
		while(true) {
		
		System.out.println("Enter the choice");
		System.out.println("press 1 for push");
		System.out.println("press 2 for peek");
		System.out.println("press 3 for pop");
		System.out.println("press 4 for display");
		System.out.println("press 5 for exit");
		int choice = s.nextInt();
		switch (choice) {
	
		case 1:
			System.out.println("Enter the element for push");
			int ele = s.nextInt();
			ms.push(ele);
		break;
		case 2 : ms.peek();
		break;
		case 3 : ms.pop();
		break;
		case 4 : ms.display();
		break;
		case 5 : System.exit(0);
		break;
		default : System.out.println("Invalid option");
		}
	}
	}
}
