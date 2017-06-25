package com.webservice.responsepojo.allproducts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category_ {

@SerializedName("type")
@Expose
private String type;
@SerializedName("subCatName")
@Expose
private String subCatName;
@SerializedName("subCateogryId")
@Expose
private String subCateogryId;
@SerializedName("categories")
@Expose
private List<Category__> categories = null;

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getSubCatName() {
return subCatName;
}

public void setSubCatName(String subCatName) {
this.subCatName = subCatName;
}

public String getSubCateogryId() {
return subCateogryId;
}

public void setSubCateogryId(String subCateogryId) {
this.subCateogryId = subCateogryId;
}

public List<Category__> getCategories() {
return categories;
}

public void setCategories(List<Category__> categories) {
this.categories = categories;
}

}
