package com.webservice.services;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.webserive.requestpojo.Login;
import com.webserive.requestpojo.LoginPojo;

public class Service {
	
	/**
	 * This API will perform login operation
	 * @param loginId
	 * @param loginSource
	 * @param password
	 * @return
	 */
	public Response login(String loginId, String loginSource, String password){
		try {
			LoginPojo loginpojo = new LoginPojo();
			Login login = new Login();
			login.setLoginId(loginId);
			login.setLoginSource(loginSource);
			login.setPassword(password);
			loginpojo.setLogin(login);
			JSONObject jsonObj = new JSONObject(loginpojo);
			RequestSpecification requestSpecification = RestAssured.given();
			requestSpecification.headers("content-type","application/json");
			requestSpecification.body(jsonObj.toString());
			Response reponse = requestSpecification.post(URLBuilder.loginurl);
			return reponse;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Response getAllProducts(){
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.headers("content-type","application/json");
		Response response = requestSpecification.get(URLBuilder.allproduct);
		System.out.println(response.asString());
		return response;
	}
	
	public static void main(String[] args) {
		//Service obj = new Service();
		//obj.login("info.bhanupratap@gmail.com", "APP", "password");
	}

}
