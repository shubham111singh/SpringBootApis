package com.training.api.centermodel;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Embeddable
public class AddressObj {
	@NotBlank(message="Address can't be empty")
	String address;
	@NotBlank(message="City can't be empty")
	String city   ;
	@NotBlank(message="State can't be empty")
	String state  ;
	@Size(min=6,max=6,message="6 Digit PIN code required")
	String pincode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}	
}
