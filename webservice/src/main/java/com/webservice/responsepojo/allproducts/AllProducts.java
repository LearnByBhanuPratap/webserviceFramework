package com.webservice.responsepojo.allproducts;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllProducts {

@SerializedName("categories")
@Expose
private List<Category> categories = null;
@SerializedName("market")
@Expose
private Market market;

public List<Category> getCategories() {
return categories;
}

public void setCategories(List<Category> categories) {
this.categories = categories;
}

public Market getMarket() {
return market;
}

public void setMarket(Market market) {
this.market = market;
}

}
