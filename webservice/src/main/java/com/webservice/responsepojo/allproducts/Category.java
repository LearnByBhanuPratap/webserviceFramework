package com.webservice.responsepojo.allproducts;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

@SerializedName("categoryId")
@Expose
private String categoryId;
@SerializedName("categoryName")
@Expose
private String categoryName;
@SerializedName("categoryType")
@Expose
private String categoryType;
@SerializedName("categories")
@Expose
private List<Category_> categories = null;

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

public String getCategoryType() {
return categoryType;
}

public void setCategoryType(String categoryType) {
this.categoryType = categoryType;
}

public List<Category_> getCategories() {
return categories;
}

public void setCategories(List<Category_> categories) {
this.categories = categories;
}

}
