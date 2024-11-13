package com.kodnest.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student11 {
	int id;
	String name;
	 public Student11(int id, String name) {
		 super();
		 this.name = name;
		 this.id = id;
	 }
	 
	 public String toString() {
		 return id + "-" + name;
	 }

	
}

public class Main3 {

	public static void main(String[] args) {
		Student11 s1 = new Student11(11,"Roman");
		Student11 s2 = new Student11(02,"Loorn");
		Student11 s3 = new Student11(31,"Big-show");
		Student11 s4 = new Student11(04,"Mark");
		Student11 s5 = new Student11(5,"John");
		
		ArrayList<Student11> al = new ArrayList<Student11>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		Collections.sort(al, new Comparator<Student11>(){

			@Override
			public int compare(Student11 o1, Student11 o2) {
//				if(o1.name.compareTo(o2.name)>0) {
//					return 1;
//				}
//				else if(o1.name.compareTo(o2.name)<0) {
//					return -1;
//				}
//				return 0;
				if(o1.id>o2.id) {
					return -1;
				}
				else if(o1.id<o2.id) {
					return 1;
				}
				return 0;
			}
			
		});
		System.out.println(al);

	}

}
