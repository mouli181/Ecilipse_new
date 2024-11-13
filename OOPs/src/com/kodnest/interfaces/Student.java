package com.kodnest.interfaces;

public interface Student {
	int value = 10;
}

class stu implements Student {
	void display() {
		System.out.println(value);
	}
}

class Solution{
	public static void main(String[] args) {
		stu s = new stu();
		s.display();
	}
}
