package com.webservice.responsepojo.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponsePojo {

	@SerializedName("customerWrapper")
	@Expose
	private CustomerWrapper customerWrapper;

	public CustomerWrapper getCustomerWrapper() {
		return customerWrapper;
	}

	public void setCustomerWrapper(CustomerWrapper customerWrapper) {
		this.customerWrapper = customerWrapper;
	}

}
