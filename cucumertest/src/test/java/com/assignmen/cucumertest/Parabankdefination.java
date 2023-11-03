package com.assignmen.cucumertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parabankdefination {
	Dataproperty dp= new Dataproperty();
	BankAction bs = new  BankAction();
	
	HomePageAction hp = new HomePageAction();
	

@Given("user is on parabank registerpage")
public void user_is_on_parabank_registerpage() {
	Helper.openPage(dp.url);
	System.out.println("register page");

}
	

	@When("user enter firstname")
	public void user_enter_firstname() {
		bs.firstName(dp.firstname);
	   
	}

	@When("user enter lastname")
	public void user_enter_lastname() {
		bs.lastName(dp.lastname);
	}

	@When("user enter address")
	public void user_enter_address() {
	  bs.setaddress(dp.address);
	}

	@When("user enter city")
	public void user_enter_city() {
		bs.setcity(dp.city);
	   
	}

	@When("user enter state")
	public void user_enter_state() {
		bs.setstate(dp.state);
	}

	@When("user enter zipcpode")
	public void user_enter_zipcpode() {
		bs.setzipcode(dp.zipcode);
	   
	}

	@When("user enter phone no")
	public void user_enter_phone_no() {
		bs.setphonenumber(dp.phonenumber);
	    
	}

	@When("user enter ssn")
	public void user_enter_ssn() {
		bs.setssn(dp.ssn);
	}

	@When("user enter username")
	public void user_enter_username() {
		bs.setUserName(dp.username);
	}

	@When("user enter password")
	public void user_enter_password() {
		bs.setPassword(dp.password);
	    
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		bs.clickregister();	    
	}

	@Then("USer Should be able to register sucessfully and login page opens")
	public void u_ser_should_be_able_to_register_sucessfully_and_login_page_opens() {
	   System.out.println("sucessfully register");
	}


}
