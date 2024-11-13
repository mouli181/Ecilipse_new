package com.kodnest.studentapp;

public class App {
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "Mouli";
		s.age = 22;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Study();
		s.Sleep();
	}

}
