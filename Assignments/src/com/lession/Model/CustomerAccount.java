package com.lession.Model;

public class CustomerAccount {

	String name;
	String Address;
	Bank banktype;
	
	public CustomerAccount(){}
	
	public CustomerAccount(String name,String addrs,Bank bnk){
		this.name = name;
		this.Address = addrs;
		this.banktype = bnk;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Bank getBanktype() {
		return banktype;
	}
	public void setBanktype(Bank banktype) {
		this.banktype = banktype;
	}
}
