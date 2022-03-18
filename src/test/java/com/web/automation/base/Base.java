package com.web.automation.base;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.utility.ConfigReader;

public class Base {
	
	static WebDriver driver;
	
	public static WebDriver initializeDriver() throws IOException
	{
	
	String browsername=ConfigReader.getproperty("Browser");
	
	if(browsername.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Suja.Soundararajan\\\\eclipse-workspace\\\\Driver\\\\Chromedriver.exe");
		 driver= new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	
	
	}
	
	

}
