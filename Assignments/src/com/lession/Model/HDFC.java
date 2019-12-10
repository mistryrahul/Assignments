package com.lession.Model;

public class HDFC extends Bank {
	
	Double min_amt=1000.0;
	double rate_of_interest=14.55;
	
	
	public HDFC()
	{
		super();
	}
	
	public HDFC(String acc_type, String acc_no, String br_addr,double loan_amt) 
	 {
	    super(acc_type, acc_no, "HDFC", br_addr, loan_amt);    
	 }

	 @Override
		public void rateOfInterest() {
			// TODO Auto-generated method stub
			System.out.println("Rate Of Interest:-"+this.rate_of_interest); 
		}

}
