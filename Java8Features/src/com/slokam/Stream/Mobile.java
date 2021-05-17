package com.slokam.Stream;

public class Mobile {
	private long mobileNumber;
	private String network;
	public Mobile(long mobileNumber, String network) {
		super();
		this.mobileNumber = mobileNumber;
		this.network = network;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getNetwork() {
		return network;
	}
	@Override
	public String toString() {
		return "Mobile [mobileNumber=" + mobileNumber + ", network=" + network + "]";
	}
	
	

}
