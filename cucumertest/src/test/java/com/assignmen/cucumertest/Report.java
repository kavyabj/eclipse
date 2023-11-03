package com.assignmen.cucumertest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(tags= "@validCrendentials",features="C:\\Users\\kbjagadeesh\\eclipse-workspace\\cucumertest\\src\\test\\resources\\data\\frame.feature", glue ="com.assignmen.cucumertest",plugin={"pretty","json:target/Cucumber-reports/Cucumber.json"})
public class Report {
	
}
