package com.lesson.Model;

public class Person {
	String Name;
	int Age;
	
	public Person()
	{
	}
	
	public Person(String name, int age)
	{
		this.Name = name;
		this.Age = age;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	

}
