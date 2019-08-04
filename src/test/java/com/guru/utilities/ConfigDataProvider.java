package com.guru.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() {
		
		File src = new File("./src/test/resources/Properties/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			System.out.println("Unable to load config file "+e.getMessage());
		}	
	}
	
	public String getBrowser() {
		
		return pro.getProperty("browser");
	}
	public String getSiteURL() {
		
		return pro.getProperty("testsiteurl");
	}
}
