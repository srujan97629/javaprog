package com.bridgeit.AnnotationAutowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfiguration.class);
		CollegeClass college = context.getBean("name", CollegeClass.class);
		System.out.println(college);
		college.test();
		//Closing costly resources
		context.close();
	}
}
