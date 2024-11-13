package com.kodnest.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	int id;
	String name;
	 public Student1(int id, String name) {
		 super();
		 this.name = name;
		 this.id = id;
	 }
	 
	 public String toString() {
		 return id + "-" + name;
	 }

	@Override
	public int compareTo(Student1 o) {
//		if(this.id>o.id) {
//			return 1;
//		}
//		else if(this.id<o.id) {
//			return -1;
//		}
//		return 0;
//	}
		if(this.id>o.id) {
			return 1;
		}
		else if(this.id<o.id) {
			return -1;
		}
		return 0;
	}
}
public class Main {

	public static void main(String[] args) {
		Student1 s1 = new Student1(11,"Roman");
		Student1 s2 = new Student1(02,"Loorn");
		Student1 s3 = new Student1(31,"Big-show");
		Student1 s4 = new Student1(04,"Mark");
		Student1 s5 = new Student1(5,"John");
		
		ArrayList<Student1> a = new ArrayList<Student1>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);

	}

}
