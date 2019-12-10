package com.lession.Runner;

import com.lession.Model.ContractEmployee;
import com.lession.Model.PermanentEmployee;
import com.lession.Model.Teacher;

public class ProblemThree {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Ram",40);
		System.out.println("Name : "+t1.getName()+"  \nAge :"+t1.getAge());
		t1.myProfession();
		System.out.println("<-->");
		PermanentEmployee pem1 = new PermanentEmployee("amit",32);
		ContractEmployee pem2 = new ContractEmployee("sumit",33);
		
		System.out.println("Name : "+pem1.getName()+" \nAge :"+pem1.getAge());
		pem1.myProfession();
		System.out.println("<-->");
		
		System.out.println("Name : "+pem2.getName()+"  \nAge :"+pem2.getAge());
		pem2.myProfession();
		System.out.println("<-->");

	}

}
