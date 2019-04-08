package com.bridgeit.ProtoTypePattern;

import java.util.List;

public class PrototypePatternTest
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Employees emps = new Employees();
		emps.loadData();		
		//Use the clone method to get the Employee object
		Employees empsFrist = (Employees) emps.clone();
		Employees empsSecound = (Employees) emps.clone();
		List<String> add = empsFrist.getEmpList();
		add.add("Me");
		List<String> remove = empsSecound.getEmpList();
		remove.remove("Srujan");		
		System.out.println("emps List : "+emps.getEmpList());
		System.out.println("empsAdded List : "+add);
		System.out.println("empsRemoved List : "+remove);
	}
}
 