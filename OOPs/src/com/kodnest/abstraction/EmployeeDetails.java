package com.kodnest.abstraction;

import java.util.Scanner;

abstract class Employee {
	String name;
	int sal;
	
	public Employee(String name,int sal) {
		this.name = name;
		this.sal = sal;
	}
	
	abstract void displayDetails();
}

class Manager extends Employee{
	String department;
	 public Manager(String name, int sal, String department) {
		super(name, sal);
		this.department = department;
	}

	

	@Override
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + sal);
		System.out.println("Department: " + department);
		
	}
}

class Worker extends Employee{
	int hoursWorked;
	public Worker(String name, int sal, int hoursWorked) {
		super(name, sal);
		this.hoursWorked = hoursWorked;
		
	}

	

	@Override
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + sal);
		System.out.println("HoursWorked: " + hoursWorked);
		
	}
}

class EmplyeeDetails{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Manager name");
		String name = s.nextLine();
		System.out.println("Enter the Manager sal");
		int sal = s.nextInt();
		System.out.println("Enter the Manager's dep");
		String department = s.next();
		
		System.out.println("Enter the emp name");
		String emname = s.next();
		System.out.println("Enter the emp sal");
		int emsal = s.nextInt();
		System.out.println("Enter the employee hoursWorkd");
		int hoursWorked = s.nextInt();
		
		Manager m = new Manager(name, sal, department);
		Worker w = new Worker(emname,emsal, hoursWorked);
		
		
		m.displayDetails();
		
		w.displayDetails();
		
		s.close();

	}
}

