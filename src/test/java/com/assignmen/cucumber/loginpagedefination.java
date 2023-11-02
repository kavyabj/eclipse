package com.assignmen.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpagedefination {
	Dataproperties data = new Dataproperties();
	LoginpagwAction objLogin = new LoginpagwAction();
	HomePageActions objHome = new HomePageActions();

	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
	    
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
	   
	}
	@When("User clicks login button")
	public void user_clicks_login_button() {
	}

	@Then("USer Should be able to login sucessfully and Home page opens")
	public void u_ser_should_be_able_to_login_sucessfully_and_home_page_opens() {
	   
	}


}
