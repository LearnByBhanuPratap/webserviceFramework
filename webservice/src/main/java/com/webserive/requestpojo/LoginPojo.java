package com.webserive.requestpojo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPojo {

@SerializedName("login")
@Expose
private Login login;

public Login getLogin() {
return login;
}

public void setLogin(Login login) {
this.login = login;
}

}
