package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Organization;
import com.kodnest.bean.Trainer;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Trainer t = (Trainer) c.getBean("trainer");
		System.out.println(t);
		Organization o = (Organization) c.getBean("o1");
		System.out.println(o);
	}

}
