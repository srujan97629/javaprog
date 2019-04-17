package com.bridgeit.AnnotationAutowiring;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("Teaching Started on Maths");
	}

}
