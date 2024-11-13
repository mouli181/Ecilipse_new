package com.kodnest.polymorpism;

public class Color {
//	void display() {
//		System.out.println("The colors are :");
//	}

	public static void main(String[] args) {
		Color c = new Color();
		c = new Red();
		((Red) c).display();
		c = new Orange();
		((Orange) c).display();
		

	}

} 
