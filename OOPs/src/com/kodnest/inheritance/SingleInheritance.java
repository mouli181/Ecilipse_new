package com.kodnest.inheritance;

public class SingleInheritance {
	void parent() {
		System.out.println("slepping");
	}

	public static void main(String[] args) {
		child s = new child();
		s.parent();
		s.read();

	}
}
	class child extends SingleInheritance{
		void read() {
			System.out.println("Reading");
		}
	}


