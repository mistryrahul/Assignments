package com.lession.Runner;

import com.lession.Model.Bank;
import com.lession.Model.CustomerAccount;
import com.lession.Model.HDFC;
import com.lession.Model.ICICI;
import com.lession.Model.SBI;

public class ProblemTwo {

	public static void main(String[] args) {
	     
		
		Bank b1 = new SBI("Savings", "1223434", "Garia Branch", 0.0);
		CustomerAccount c1 = new CustomerAccount("Rahul","Kolkata",b1);
		
		Bank b2 = new HDFC("Savings", "324343434", "Haldia Branch", 20000.0);
		CustomerAccount c2 = new CustomerAccount("Ram","Haldia",b2);
		
		Bank b3 = new ICICI("Current", "000232334", "Siliguri Branch", 20000.0);
		CustomerAccount c3 = new CustomerAccount("Ram","Jalpaiguri",b3);
		
		
		System.out.println("<===Customer Details====>");
		  
		   System.out.println(c1.getName());
		   System.out.println(c1.getAddress());
		   c1.getBanktype().AccountDetails();
		   c1.getBanktype().LoanDetails();
		   c1.getBanktype().rateOfInterest();
		   
		 
		System.out.println("<===Customer Details====>");
		
		System.out.println("<===Customer Details====>");
		  
		   System.out.println(c2.getName());
		   System.out.println(c2.getAddress());
		   c2.getBanktype().AccountDetails();
		   c2.getBanktype().LoanDetails();
		   c2.getBanktype().rateOfInterest();
		   
		 
		System.out.println("<===Customer Details====>");
		
		System.out.println("<===Customer Details====>");
		  
		   System.out.println(c3.getName());
		   System.out.println(c3.getAddress());
		   c3.getBanktype().AccountDetails();
		   c3.getBanktype().LoanDetails();
		   c3.getBanktype().rateOfInterest();
		   
		 
		System.out.println("<===Customer Details====>");
		
		
	}

}
