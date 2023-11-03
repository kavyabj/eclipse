package com.assignmen.cucumertest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
 
 
public class HookClass {
	
		@Before
		public static void setUp() {
			Helper.setUpDriver();
		}
		@After
		public static void tearDown(Scenario scenario) {
			Helper.tearDown();
		}
	 
	}

