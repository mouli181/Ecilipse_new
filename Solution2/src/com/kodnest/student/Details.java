package com.kodnest.student;

public class Details {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Mouli";
		System.out.println(s1.name);
		s1.age = 23;
		System.out.println(s1.age);
		s1.adress = "Madiwala,Bengalore";
		System.out.println(s1.adress);
		s1.study();
		s2.name = "Rohit";
		System.out.println(s2.name);
		s2.age = 23;
		System.out.println(s2.age);
		s2.adress = "Madiwala,Bengalore";
		System.out.println(s2.adress);
		s2.sleep();
	}

}
