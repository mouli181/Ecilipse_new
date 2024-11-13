package com.kodnest.datastructures;

import java.util.Scanner;

class Queue{
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;
	private Scanner scan = new Scanner(System.in);
	
	public Queue(int n) {
		q = new int[n];
		size = q.length;
	}
	public void insert() {
		int elem;
		if(r == size-1) {
			System.out.println("insert not possible");
		}
		else {
			System.out.println("Enter the element");
			elem = scan.nextInt();
			++r;
			q[r] = elem;
		}
	}
	public void delete() {
		if(r == -1 || f>r) {
			System.out.println("delete not possible");
		}
		else {
			System.out.println("element deleted is " + q[f]);
			++f;
		}
	}
	public void display() {
		if(r == -1 || f>r) {
			System.out.println("Display not possible");
		}
		else {
			for(int i=f;i<=r;i++) {
				System.out.print(q[i] + " ");
			}
			System.out.println();
		}
	}
}

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Queue size");
		int n = sc.nextInt();
		Queue s = new Queue(n);
		while(true) {
			System.out.println("Press-1-------insert");
			System.out.println("Press-2-------delete");
			System.out.println("Press-3-------display");
			System.out.println("Press any other number for stop");
			System.out.println("Enter the number");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : s.insert();
			break;
			case 2 : s.delete();
			break;
			case 3 : s.display();
			break;
			default : System.exit(0);
			}
		}

	}

}
