package com.kodnest.threed;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	public Employee(String name, int age) {
		this.name = name ;
		this.age = age;
//	void work() {
//		System.out.println("Work");
//	}
//	void sleep() {
//		System.out.println("Sleep");
//	}
	}
}
class kodnest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Employee[] a = new Employee[3];
		
		System.out.println("Enter the employee details");
		System.out.println("---------------------------");
		
		int j=1;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the employee-" + (j) + "name");
			String name = s.next();
			System.out.println("Enter the employee-"+ (j)+"age");
			int age = s.nextInt();
			a[i] = new Employee(name,age);
			j++;
		}
		System.out.println("Employee details are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].name+ "-"+a[i].age);
			System.out.println();
		}
		//System.out.println();	
	}
}


