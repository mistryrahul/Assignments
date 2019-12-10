package com.lesson.Runner;

import com.lesson.Model.ContractEmployee;
import com.lesson.Model.PermanentEmployee;
import com.lesson.Model.Teacher;

public class ProblemThree {

	public static void main(String[] args) {
		
//		Teacher instance
		Teacher t1 = new Teacher("Ram",40);
		System.out.println("Name : "+t1.getName()+"  \nAge :"+t1.getAge());
		t1.myProfession();
		System.out.println("<-->");
		
//		permanent Employee instance
		PermanentEmployee pem1 = new PermanentEmployee("amit",32);
		System.out.println("Name : "+pem1.getName()+" \nAge :"+pem1.getAge());
		pem1.myProfession();
		System.out.println("<-->");
		
//		Contractual Employee instance
		ContractEmployee pem2 = new ContractEmployee("sumit",33);
		System.out.println("Name : "+pem2.getName()+"  \nAge :"+pem2.getAge());
		pem2.myProfession();
		System.out.println("<-->");

	}

}
