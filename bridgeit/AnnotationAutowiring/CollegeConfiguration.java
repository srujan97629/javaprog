package com.bridgeit.AnnotationAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.bridgeit.AnnotationAutowiring")
@PropertySource(value = { "college-info.properties" })
public class CollegeConfiguration {
	/*
	 * public Teacher tech1() 
	 * { 
	 * return new MathTeacher();
	 *  }
	 * 
	 * @Bean 
	 * public Principal principal() {
	 *  return new Principal(); 
	 *  }
	 * 
	 * @Bean 
	 * public CollegeClass collegeBean()// collegeBean is an id ofCollegeClass
	 *  { 
	 *     //return new CollegeClass(principal());
	 * 
	 * 
	 * CollegeClass college = new CollegeClass();
	 *  college.setPrincipal(principal());
	 * college.setTeacher(tech1());
	 *  return college;
	 * 
	 * }
	 */
}
