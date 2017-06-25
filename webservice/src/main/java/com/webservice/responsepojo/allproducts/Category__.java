package com.webservice.responsepojo.allproducts;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category__ {

@SerializedName("mainCategory")
@Expose
private String mainCategory;
@SerializedName("categoryId")
@Expose
private String categoryId;
@SerializedName("categoryName")
@Expose
private String categoryName;
@SerializedName("sortPriority")
@Expose
private String sortPriority;
@SerializedName("isCategory")
@Expose
private Integer isCategory;
@SerializedName("eventId")
@Expose
private String eventId;
@SerializedName("eventName")
@Expose
private String eventName;
@SerializedName("noOfProducts")
@Expose
private String noOfProducts;
@SerializedName("conversionRate")
@Expose
private Integer conversionRate;

public String getMainCategory() {
return mainCategory;
}

public void setMainCategory(String mainCategory) {
this.mainCategory = mainCategory;
}

public String getCategoryId() {
return categoryId;
}

public void setCategoryId(String categoryId) {
this.categoryId = categoryId;
}

public String getCategoryName() {
return categoryName;
}

public void setCategoryName(String categoryName) {
this.categoryName = categoryName;
}

public String getSortPriority() {
return sortPriority;
}

public void setSortPriority(String sortPriority) {
this.sortPriority = sortPriority;
}

public Integer getIsCategory() {
return isCategory;
}

public void setIsCategory(Integer isCategory) {
this.isCategory = isCategory;
}

public String getEventId() {
return eventId;
}

public void setEventId(String eventId) {
this.eventId = eventId;
}

public String getEventName() {
return eventName;
}

public void setEventName(String eventName) {
this.eventName = eventName;
}

public String getNoOfProducts() {
return noOfProducts;
}

public void setNoOfProducts(String noOfProducts) {
this.noOfProducts = noOfProducts;
}

public Integer getConversionRate() {
return conversionRate;
}

public void setConversionRate(Integer conversionRate) {
this.conversionRate = conversionRate;
}

}