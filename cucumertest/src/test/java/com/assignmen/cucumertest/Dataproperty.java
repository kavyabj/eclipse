package com.assignmen.cucumertest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Dataproperty {
	String url;
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	String zipcode;
	String phonenumber;
	String ssn;
	String username;
	String password;
	String confirmpassword;
	
	public Dataproperty(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\kbjagadeesh\\eclipse-workspace\\cucumertest\\src\\test\\resources\\data\\bank.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		 firstname = prop.getProperty("Firstname");
		lastname  = prop.getProperty ("Lastname");
		 address =prop.getProperty("Address");
		 city =prop.getProperty("City");
		 state =  prop.getProperty("State");
		  zipcode = prop.getProperty("ZipCode");
		   phonenumber=prop.getProperty("Phone")  ;
		  ssn  = prop.getProperty("SSN");
		 username = prop.getProperty("Username");
		password = prop.getProperty("Password");
		confirmpassword =prop.getProperty("Confirm");		
	}
}
