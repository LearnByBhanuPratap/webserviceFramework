package com.webservice;

import java.util.List;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.jayway.restassured.response.Response;
import com.webservice.responsepojo.allproducts.AllProducts;
import com.webservice.responsepojo.allproducts.Category;
import com.webservice.responsepojo.allproducts.Category_;
import com.webservice.responsepojo.allproducts.Category__;
import com.webservice.responsepojo.allproducts.Market;
import com.webservice.services.Service;

public class GetAllProducts {
	Service service;
	Response responseData;
	
	@Test
	public void testGetAllProducts(){
		service = new Service();
		responseData = service.getAllProducts();
		
		Gson gson = new Gson();
		AllProducts data = gson.fromJson(responseData.asString(), AllProducts.class);
		
		List<Category> getCategories = data.getCategories();
		
		for(int i =0; i<getCategories.size(); i++){
			System.out.println(getCategories.get(i).getCategoryId());
			System.out.println(getCategories.get(i).getCategoryType());
			System.out.println(getCategories.get(i).getCategoryType());
		}
		System.out.println("--------------");
		List<Category_> category_ = getCategories.get(0).getCategories();
		for(int i =0; i<category_.size(); i++){
			System.out.println(category_.get(i).getSubCateogryId());
			System.out.println(category_.get(i).getSubCatName());
			System.out.println(category_.get(i).getType());
		}
		System.out.println("--------------");
		List<Category__> category__ = category_.get(0).getCategories();
		for(int i =0; i<category__.size(); i++){
			System.out.println(category__.get(i).getCategoryId());
			System.out.println(category__.get(i).getCategoryName());
			System.out.println(category__.get(i).getEventId());
			System.out.println(category__.get(i).getEventName());
			System.out.println(category__.get(i).getMainCategory());
			System.out.println(category__.get(i).getNoOfProducts());
			System.out.println(category__.get(i).getSortPriority());
			System.out.println(category__.get(i).getConversionRate());
		}
		System.out.println("--------------");
		System.out.println(category__.get(0).getCategoryName());
		
		Market getMarket = data.getMarket();
		getMarket.getBanner();
		
		
	}
}
