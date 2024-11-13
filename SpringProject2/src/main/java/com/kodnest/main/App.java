package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop l = (Laptop) c.getBean("l1");
		System.out.println(l);
		Laptop l2 = (Laptop) c.getBean("l2");
		System.out.println(l2);
	}

}  
 