package com.webservice.responsepojo.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customers {

	@SerializedName("createDate")
	@Expose
	private String createDate;
	@SerializedName("createdBy")
	@Expose
	private Integer createdBy;
	@SerializedName("customerId")
	@Expose
	private Integer customerId;
	@SerializedName("dateOfBirth")
	@Expose
	private String dateOfBirth;
	@SerializedName("firstName")
	@Expose
	private String firstName;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("lastName")
	@Expose
	private String lastName;
	@SerializedName("loginId")
	@Expose
	private String loginId;
	@SerializedName("loginType")
	@Expose
	private String loginType;
	@SerializedName("modifiedDate")
	@Expose
	private String modifiedDate;
	@SerializedName("password")
	@Expose
	private String password;
	@SerializedName("registrationDate")
	@Expose
	private String registrationDate;
	@SerializedName("registrationEmailSend")
	@Expose
	private String registrationEmailSend;
	@SerializedName("siteLink")
	@Expose
	private String siteLink;
	@SerializedName("state")
	@Expose
	private String state;

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRegistrationEmailSend() {
		return registrationEmailSend;
	}

	public void setRegistrationEmailSend(String registrationEmailSend) {
		this.registrationEmailSend = registrationEmailSend;
	}

	public String getSiteLink() {
		return siteLink;
	}

	public void setSiteLink(String siteLink) {
		this.siteLink = siteLink;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}