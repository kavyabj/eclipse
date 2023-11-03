package com.assignmen.cucumertest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	private static Helper helperClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT=10;
	Helper(){
		driver = new EdgeDriver();
		wait =new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass=new Helper();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		helperClass=null;
	}
 

}



