package com.webservice.responsepojo.allproducts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banner {
	@SerializedName("isBanner")
	@Expose
	private Boolean isBanner;
	@SerializedName("ImageUrl")
	@Expose
	private String imageUrl;
	@SerializedName("bannerpos")
	@Expose
	private String bannerpos;

	public Boolean getIsBanner() {
	return isBanner;
	}

	public void setIsBanner(Boolean isBanner) {
	this.isBanner = isBanner;
	}

	public String getImageUrl() {
	return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
	}

	public String getBannerpos() {
	return bannerpos;
	}

	public void setBannerpos(String bannerpos) {
	this.bannerpos = bannerpos;
	}

}
