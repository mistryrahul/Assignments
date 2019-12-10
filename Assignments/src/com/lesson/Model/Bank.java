package com.lesson.Model;

public abstract class Bank {
	
	private  String Accountype;
	private String Account_No;
	private String Branch_name;
	private String Branch_address;
	private double Loan_Taken;
    
	public Bank()
	{
	}
	
	public Bank(String acc_type, String acc_no, String br_name, String br_addr,double loan_amt)
	{
		Account_No = acc_no;
		Accountype = acc_type;
		Branch_address = br_addr;
		Branch_name = br_name;
		Loan_Taken = loan_amt;
	}
	
	
	
	public void AccountDetails()
	{
	   System.out.println("Acc NO :"+Account_No+" \nAccount Type:"+Accountype+" \nBranch Name:"+Branch_name+" \nBranch Address: "+Branch_address);
	}
	
	public void LoanDetails()
	{
		System.out.println("Total Loan Taken : "+Loan_Taken);
	}
	
	public abstract void  rateOfInterest();

	
	public String getAccountype() {
		return Accountype;
	}

	public void setAccountype(String accountype) {
		Accountype = accountype;
	}

	public String getAccount_No() {
		return Account_No;
	}

	public void setAccount_No(String account_No) {
		Account_No = account_No;
	}

	public String getBranch_name() {
		return Branch_name;
	}

	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}

	public String getBranch_address() {
		return Branch_address;
	}

	public void setBranch_address(String branch_address) {
		Branch_address = branch_address;
	}

	public double getLoan_Taken() {
		return Loan_Taken;
	}

	public void setLoan_Taken(double loan_Taken) {
		Loan_Taken = loan_Taken;
	}
	
	
	
	
	
	
}
