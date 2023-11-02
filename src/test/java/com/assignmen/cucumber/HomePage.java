package com.assignmen.cucumber;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	HomePageLocators homepageLocators ;
	
	public HomePage(){
		homepageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homepageLocators);
	}
	
	public String getVerifyText() {
		return homepageLocators.verifyText.getText();
	}
}



