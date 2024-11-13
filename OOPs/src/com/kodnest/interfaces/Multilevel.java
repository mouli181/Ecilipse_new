package com.kodnest.interfaces;

public interface Multilevel {
	String name = "mouli";
	int age = 20;
}

class multi implements Multilevel{
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
}

class mul extends multi{
	void display1() {
		System.out.println(age);
		System.out.println(name);
	}
}

class Sol{
	public static void main(String[] args) {
		mul m = new mul();
		m.display1();
	}
}