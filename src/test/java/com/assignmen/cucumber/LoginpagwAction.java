package com.assignmen.cucumber;

import org.openqa.selenium.support.PageFactory;

public class LoginpagwAction {
	 loginPageLocators  loginPageLocators=null;
 
public LoginpagwAction() {
	 loginPageLocators = new loginPageLocators();
	
	PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
}
 
	
	public void setUserName(String strUserName) {
	loginPageLocators.username.sendKeys(strUserName);
}
	public void setPassword(String strPassword) {
	loginPageLocators.Password.sendKeys(strPassword);
}
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	public void loginInfo(String username, String password) {
		setUserName(username);
		setPassword(password);
	}
}



