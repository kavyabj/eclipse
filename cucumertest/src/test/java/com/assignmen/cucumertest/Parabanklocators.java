package com.assignmen.cucumertest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Parabanklocators {

	@FindBy(xpath ="//*[@id='customer.firstName']")
	public WebElement firstname;
	@FindBy(xpath = "//*[@id='customer.lastName']")
	public WebElement lastname;
	@FindBy(xpath ="//*[@id='customer.address.street']")
	public WebElement address;
	@FindBy(xpath ="//*[@id='customer.address.city']")
	public WebElement city;
	@FindBy(xpath = "//*[@id='customer.address.state']")
	public WebElement state;
	@FindBy(xpath = "//*[@id='customer.address.zipCode']")
	public WebElement zipcode;
	@FindBy(xpath="//*[@id='customer.phoneNumber']")
	public WebElement phonenumber;
	@FindBy(xpath="//*[@id='customer.ssn']")
	public WebElement ssn;
	@FindBy(xpath="//*[@id='customer.username']")
	public WebElement username;
	@FindBy(xpath="//*[@id='customer.password']")
	public WebElement password;
	@FindBy(xpath="//*[@id='repeatedPassword']")
	public WebElement confirmpassword;
	@FindBy(xpath="//*[@id='customerForm']/table/tbody/tr[13]/td[2]")
	public WebElement  register;
	
}
			