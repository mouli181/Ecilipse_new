package com.kodnest.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



class Student implements Comparable<Student>{
	
	int id;
	String name;
	 public Student(int id, String name) {
		 super();
		 this.name = name;
		 this.id = id;
	 }
	 
	 public String toString() {
		 return id + " " + name;
	 }

	@Override
	public int compareTo(Student o) {
		if(this.id>o.id) {
			return 1;
		}
		else if(this.id<o.id) {
			return -1;
		}
		return 0;
	}
	
	
}


class Main {

	public static void main(String[] args) {
		
		
		
		
		
		Student s1 = new Student(85,"John");
		Student s2 = new Student(92,"Jane");
		Student s3 = new Student(78,"Bob");
		
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
	}

}
