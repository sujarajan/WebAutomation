package com.web.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.automation.base.Base;

public class ConfigReader {
	
	public static String getproperty(String Key) {
		
		try {
		Properties property=new Properties();
		FileInputStream file=new FileInputStream("Configfiles/Projectconfig.properties");
		property.load(file);
		return property.getProperty(Key).trim();
		
		}
		catch(Exception e) {
			e.printStackTrace();
			throw(new RuntimeException(Key + "Key that is entered not exists "));
		}
		
	}
	
	
	
	
   public static  String setLocators(String Key) throws IOException {

		try {
		Properties property=new Properties();
		FileInputStream file=new FileInputStream("Configfiles/Locators.properties");
		property.load(file);
		String value= property.getProperty(Key).trim();
		System.out.println(value);
		return value;
		}
   
	catch(Exception e) {
		e.printStackTrace();
		throw(new RuntimeException(Key + "Key that is entered not exists "));
	}
	
		
	}
   
   
   
   
   
   

}
