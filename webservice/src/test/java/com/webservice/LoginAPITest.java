package com.webservice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.webservice.responsepojo.login.CustomerWrapper;
import com.webservice.responsepojo.login.Customers;
import com.webservice.responsepojo.login.LoginResponsePojo;
import com.webservice.services.Service;

public class LoginAPITest {
	Service service;
	Response responseData;
	
	@Test
	public void loginAPITest(){
		service = new Service();
		responseData = service.login("info.bhanupratap@gmail.com", "APP", "password");
		System.out.println(responseData.asString());
        
		Gson gson = new Gson();
		LoginResponsePojo data = gson.fromJson(responseData.asString(), LoginResponsePojo.class);
		
		CustomerWrapper customerWrapper = data.getCustomerWrapper();
		System.out.println(customerWrapper.getResponseCode());
		
		Customers getcustomers = customerWrapper.getCustomers();
		
		System.out.println(getcustomers.getCreateDate());
		System.out.println(getcustomers.getGender());
		System.out.println(getcustomers.getFirstName());

		Assert.assertEquals(getcustomers.getCreateDate(), "2012-05-08T14:08:36+05:30");
		Assert.assertEquals(getcustomers.getGender(), "M");
		Assert.assertEquals(getcustomers.getFirstName(), "Bhanu");
		Assert.assertEquals(customerWrapper.getResponseCode(), "SUCCESS");
		
	}

}
