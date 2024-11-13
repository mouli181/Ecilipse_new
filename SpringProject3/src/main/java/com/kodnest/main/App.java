package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Employee;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee emp = (Employee) c.getBean("e1");
		System.out.println(emp);
//		Employee em = (Employee) c.getBean("e2");
//		System.out.println(em);
		
	}

}
