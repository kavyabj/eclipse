package com.assignmen.cucumertest;
import org.openqa.selenium.support.PageFactory;


public class HomePageAction {
	HomePageLocators homepageLocators;
	public  HomePageAction(){
			homepageLocators = new HomePageLocators();
			
			PageFactory.initElements(Helper.getDriver(), homepageLocators);
		}
		
		public String getVerifyText() {
			return homepageLocators.verify.getText();
		}
	}


