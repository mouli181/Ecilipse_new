package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Student;
import com.kodnest.bean.Vehicle;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Student s = (Student) c.getBean("s1");
		System.out.println(s);
		Vehicle v = (Vehicle) c.getBean("v1");
		System.out.println(v);
		

	}

}
