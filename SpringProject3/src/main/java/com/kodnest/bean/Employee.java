package com.kodnest.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Employee {
	ArrayList<String> technologies;
	HashSet<String> projects;
	HashMap<Integer,String> organizations;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(ArrayList<String> technologies, HashSet<String> projects, HashMap<Integer, String> organizations) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.organizations = organizations;
	}
	public ArrayList<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		this.technologies = technologies;
	}
	public HashSet<String> getProjects() {
		return projects;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", organizations=" + organizations
				+ "]";
	}
	public void setProjects(HashSet<String> projects) {
		this.projects = projects;
	}
	public HashMap<Integer, String> getOrganizations() {
		return organizations;
	}
	public void setOrganizations(HashMap<Integer, String> organizations) {
		this.organizations = organizations;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String technology;
//	String project;
//	String organization;
//	public Employee() {
//		super();
//		
//	}
//	public Employee(String technology, String project, String organization) {
//		super();
//		this.technology = technology;
//		this.project = project;
//		this.organization = organization;
//	}
//	public String getTechnology() {
//		return technology;
//	}
//	public void setTechnology(String technology) {
//		this.technology = technology;
//	}
//	public String getProject() {
//		return project;
//	}
//	public void setProject(String project) {
//		this.project = project;
//	}
//	public String getOrganization() {
//		return organization;
//	}
//	public void setOrganization(String organization) {
//		this.organization = organization;
//	}
//	@Override
//	public String toString() {
//		return "Employee [technology=" + technology + ", project=" + project + ", organization=" + organization + "]";
//	}
	

