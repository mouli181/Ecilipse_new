package com.kodnest.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

class MyQueue{
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void enque(int ele) {
		al.add(ele);
		System.out.println(ele + " added");
	}
	void deque() {
		if(al.isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			Integer ele = al.remove(0);
			System.out.println(ele + " removed");
		}
	}
	void peek() {
		if(al.size()==0) {
			System.out.println("Queue is empty");
		}
		else {
		System.out.println(al.get(al.size()-1) + " peek sucess");
	}
	}
	void display() {
		if(al.isEmpty()) {
			System.out.println("Queue is empty");
		}else {
		System.out.println(al);
	}
	}
}

public class MainQueue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to QueueApp");
		MyQueue mq = new MyQueue();
		while(true) {
		System.out.println("Enter the choice");
		System.out.println("press 1 for push");
		System.out.println("press 2 for delete");
		System.out.println("press 3 for peek");
		System.out.println("press 4 for display");
		System.out.println("enter 5 for exit");
		int choice  = s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the element for inserting");
			int ele = s.nextInt();
			mq.enque(ele);
			break;
		case 2:
			mq.deque();
			break;
		case 3:
			mq.peek();
			break;
		case 4:
			mq.display();
			break;
		case 5 :
			System.exit(0);
		default : System.out.println("invalid option");
		}
		}
	}

}
