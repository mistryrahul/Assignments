package com.lession.Model;

public class Teacher extends Person {
	
	public Teacher()
	{
		super();
	}
  
	public Teacher(String name,int age)
	{
		super(name,age);
	}
	
	
	public void myProfession()
	{
		System.out.println("Profession : Teaching");
	}
}
