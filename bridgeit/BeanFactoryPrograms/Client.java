package com.bridgeit.BeanFactoryPrograms;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


@SuppressWarnings("deprecation")
public class Client 
{
   public static void main(String[] args)
   {
      Resource refcontext= new ClassPathResource("employeebean.xml");
	   BeanFactory refFactory= new XmlBeanFactory(refcontext);
	   Employee refE1= (Employee)refFactory.getBean("emp1");
	   Employee refE2= (Employee)refFactory.getBean("emp2");
	   System.out.println("Employee 1 details"+refE1);
	   System.out.println("Employee 1 details"+refE2);

   }
}
