package com.webservice.responsepojo.allproducts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Market {

@SerializedName("banner")
@Expose
private List<Banner> banner = null;

public List<Banner> getBanner() {
return banner;
}

public void setBanner(List<Banner> banner) {
this.banner = banner;
}

}



