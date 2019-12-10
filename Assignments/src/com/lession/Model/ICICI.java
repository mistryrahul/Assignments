package com.lession.Model;

public class ICICI extends Bank{
	
	Double min_amt=5000.0;
	double rate_of_interest=14.5;
	
	public ICICI()
	{
		super();
	}
	
	public ICICI(String acc_type, String acc_no, String br_addr,double loan_amt) 
	 {
	    super(acc_type, acc_no, "ICICI", br_addr, loan_amt);    
	 }

	 @Override
		public void rateOfInterest() {
			// TODO Auto-generated method stub
			System.out.println("Rate Of Interest:-"+this.rate_of_interest); 
		}

}
