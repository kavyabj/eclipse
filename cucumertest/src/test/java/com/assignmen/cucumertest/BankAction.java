package com.assignmen.cucumertest;

import org.openqa.selenium.support.PageFactory;

public class BankAction {
	
	Parabanklocators Parabanklocators=null;
	 
	public BankAction() {
		Parabanklocators = new Parabanklocators();
		PageFactory.initElements(Helper.getDriver(), Parabanklocators);
	}
	 
	public void firstName(String strfirstName) {
		Parabanklocators.firstname.sendKeys(strfirstName);
	}
	public void lastName(String strlastName) {
		Parabanklocators.lastname.sendKeys(strlastName);
	}
	public void setaddress(String straddress) {
		Parabanklocators.address.sendKeys(straddress);
		
	}
	public void setcity(String strcity) {
		Parabanklocators.city.sendKeys(strcity);
	}
	public void setstate(String strstate) {
		Parabanklocators.state.sendKeys(strstate);
	}
	public void setzipcode(String strzipcode) {
		Parabanklocators.zipcode.sendKeys(strzipcode);
	}
	public void setphonenumber(String strphonenumber) {
		Parabanklocators.phonenumber.sendKeys(strphonenumber);
	}
	public void setssn(String strssn) {
		Parabanklocators.ssn.sendKeys(strssn);
	}
	
		public void setUserName(String strUserName) {
			Parabanklocators.username.sendKeys(strUserName);
	}
		public void setPassword(String strPassword) {
			Parabanklocators.password.sendKeys(strPassword);
	}
		public void setconfirmpassword(String strconfirmpassword) {
			Parabanklocators.confirmpassword.sendKeys(strconfirmpassword);
		}
		public void clickregister() {
			Parabanklocators.register.click();
		}
		public void registerInfo(String username, String password) {
			setUserName(username);
			setPassword(password);
		}
	}



