package com.lesson.Model;

public class Employee extends Person {

	public Employee() {super();}
	
	public Employee(String name,int age) {
		super(name,age);
	}
	
	public void myProfession()
	{
		System.out.println("Profession : Employee");
	}
	
}
