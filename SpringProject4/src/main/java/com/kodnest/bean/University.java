package com.kodnest.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	int uid;
	String uname;
	//by name
	//@Autowired
	Trainer trainer;
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", trainer=" + trainer + "]";
	}
	public int getUid() {
		System.out.println("this is getter id");
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
		System.out.println("This is setter id");
	}
	public String getUname() {
		System.out.println("this is getter name ");
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("This is setter name");
	}
	public Trainer getTrainer() {
		System.out.println("this is getter trainer name ");
		return trainer;
	}
	//for setter injection
	//@Autowired
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
		System.out.println("This is setter trainer");
	}
	//for constructor
	@Autowired
	public University(int uid, String uname, Trainer trainer) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.trainer = trainer;
		System.out.println("para cons");
	}
	public University() {
		super();
		System.out.println("0-para cons");
		// TODO Auto-generated constructor stub
	}
	
	
}
