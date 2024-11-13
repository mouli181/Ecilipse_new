package com.kodnest.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student10 {
	int id;
	String name;
	 public Student10(int id, String name) {
		 super();
		 this.name = name;
		 this.id = id;
	 }
	 
	 public String toString() {
		 return id + "-" + name;
	 }

	
}
class Sorting1 implements Comparator<Student10>{

	@Override
	public int compare(Student10 o1, Student10 o2) {
//		if(o1.name.compareTo(o2.name)>0) {
//			return 1;
//		}
//		else if(o1.name.compareTo(o2.name)<0) {
//			return -1;
//		}
//		return 0;
		if(o1.id>o2.id) {
			return -1;
		}
		else if(o1.id<o2.id) {
			return 1;
		}
		return 0;
	}
	
}
public class Main2 {

	public static void main(String[] args) {
		Student10 s1 = new Student10(11,"Roman");
		Student10 s2 = new Student10(02,"Loorn");
		Student10 s3 = new Student10(31,"Big-show");
		Student10 s4 = new Student10(04,"Mark");
		Student10 s5 = new Student10(5,"John");
		
		ArrayList<Student10> al = new ArrayList<Student10>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		Collections.sort(al, new Sorting1());
		System.out.println(al);

	}

}
