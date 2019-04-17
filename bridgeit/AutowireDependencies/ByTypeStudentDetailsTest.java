package com.bridgeit.AutowireDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByTypeStudentDetailsTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ByTypeBean.xml");
		ByTypeStudentDetails refStudentBean = context.getBean("student",ByTypeStudentDetails.class);
		System.out.println("Student Details ");
		System.out.println(refStudentBean);
		ClassPathXmlApplicationContext refclose=(ClassPathXmlApplicationContext)context;
		refclose.close();
	}

}
