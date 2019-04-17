package com.bridgeit.ApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRegister
{
   public static void main(String[] args) 
   {
	 ApplicationContext context=new ClassPathXmlApplicationContext("StudentBean.xml");
	 StudentDetails refStudent1= (StudentDetails)context.getBean("student1");
	 StudentDetails refStudent2= (StudentDetails)context.getBean("student2");
	 System.out.println("Student 1 Details  "+refStudent1);
	 System.out.println("Student 1 Details  "+refStudent2);
   }
}
