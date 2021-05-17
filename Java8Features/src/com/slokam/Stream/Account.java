package com.slokam.Stream;

public class Account {

	private long accNumber;
	private String bankName;
	
	public Account(long accNumber, String bankName) {
		super();
		this.accNumber = accNumber;
		this.bankName = bankName;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", bankName=" + bankName + "]";
	}
	
	
	
	
	
}
