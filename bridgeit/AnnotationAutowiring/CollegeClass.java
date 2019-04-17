package com.bridgeit.AnnotationAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("name")
public class CollegeClass {
	@Value(value = "${collegeName}")
	String name;
	@Autowired
	private Principal principal;
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;

	/*public CollegeClass(Principal principal) {
		super();
		this.principal = principal;
	}*/

	public void test() {
		teacher.teach();
		principal.details();
		System.out.println("Method working  " + name);
	}
	/*
	 * @Autowired public void setPrincipal(Principal principal) { this.principal =
	 * principal; }
	 * 
	 * @Autowired public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * }
	 */

}
