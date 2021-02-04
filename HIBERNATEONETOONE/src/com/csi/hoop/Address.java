package com.csi.hoop;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	
	private int addressId;
	
	private String addressStreet;
	
	private String addresscity;
	
	private String addressState;
	
	private String addressCountry;
	
	private int addressPinCode;

	public Address(String addressStreet, String addresscity, String addressState, String addressCountry,
			int addressPinCode) {
		
		this.addressStreet = addressStreet;
		this.addresscity = addresscity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressPinCode = addressPinCode;
	}
	
	
	

	

}
