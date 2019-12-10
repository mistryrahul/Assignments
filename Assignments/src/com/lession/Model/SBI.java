package com.lession.Model;

public class SBI extends Bank{

	Double min_amt=500.0;
	double rate_of_interest=13.5;
	
	public SBI()
	{
		super();
	}
	
	public SBI(String acc_type, String acc_no, String br_addr,double loan_amt) 
	 {
	    super(acc_type, acc_no, "SBI", br_addr, loan_amt);    
	 }
	
	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("Rate Of Interest:-"+this.rate_of_interest); 
	}

}
