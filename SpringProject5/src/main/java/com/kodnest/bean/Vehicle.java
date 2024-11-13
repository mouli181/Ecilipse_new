package com.kodnest.bean;

public class Vehicle {
	String vname;
	int vprice;
	
	Student student;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vname, int vprice, Student student) {
		super();
		this.vname = vname;
		this.vprice = vprice;
		this.student = student;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public int getVprice() {
		return vprice;
	}

	public void setVprice(int vprice) {
		this.vprice = vprice;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Vehicle [vname=" + vname + ", vprice=" + vprice + ", student=" + student + "]";
	}
	
}
