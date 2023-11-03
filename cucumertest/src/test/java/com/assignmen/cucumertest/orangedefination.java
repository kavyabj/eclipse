package com.assignmen.cucumertest;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class orangedefination {
	WebDriver driver = new EdgeDriver();
	@Given("user is in orange hrm login")
	public void user_is_in_orange_hrm_login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user provide valid credentials")
	public void user_provide_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("cred entered");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String username =form.get("Username");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
			String password=form.get("Password");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
					
		}
	}

	@Then("user should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		String newPageText=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		System.out.println("newpagetxt");
		Assert.assertTrue(newPageText.equals("Dashboard"));
	}

		@Then("User should be able to see unsucessfull with error message")
		public void user_should_be_able_to_see_unsucessfull_with_error_message() {
			String expectedError =driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
			Assert.assertTrue(expectedError.equals("Invalid credentials"));
	}
}


