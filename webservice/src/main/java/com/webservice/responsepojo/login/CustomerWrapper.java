package com.webservice.responsepojo.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerWrapper {

	@SerializedName("responseCode")
	@Expose
	private String responseCode;
	@SerializedName("customers")
	@Expose
	private Customers customers;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

}