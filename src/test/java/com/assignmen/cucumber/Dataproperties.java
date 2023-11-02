package com.assignmen.cucumber;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	public class Dataproperties {
		String url;
		String username;
		String password;
		
		public Dataproperties(){
			data();
		}
		public void data() {
			File file = new File("C:\\Users\\kbjagadeesh\\eclipse-workspace\\cucumber\\src\\test\\resources\\Feature\\data.properties");
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
			username = prop.getProperty("username");
		    password = prop.getProperty("password");
		}
	}


