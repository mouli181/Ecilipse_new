package com.kodnest.arraylist;

public class Student {
	
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student {name : "+name +", age : " + age+"}";
	}

	public static void main(String[] args) {
		Student s = new Student(10,"Mouli");
		System.out.println(s);
		Student s1 = new Student(10,"tharan");
		System.out.println(s1);

	}

}
