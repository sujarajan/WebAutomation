package com.web.automation.stepdefenition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




import io.cucumber.java.en.Given;





public class searchvalue {
		
	
	@Given("I am on google chrome")
	public void launchgoogle() throws IOException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suja.Soundararajan\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']")).sendKeys("Television",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("20,000");
		driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("30,000");
		
		driver.findElement(By.xpath("//span[@id='a-autoid-1']")).click();
		List <WebElement> l=driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));

		for(WebElement s: l) {
			
			String i= s.getText().replace("," , "");
			
			int j=Integer.parseInt(i);
			
			if(j<20000||j>30000) {
				System.out.println(j+" : Price value not Matching Filter Loop1");
			}
			else if(j>=20000||j<=30000)
				System.out.println(j+" : Price value matching the Filter loop1");

		}
		
		
		
		
			 
			
		}
		
		
	
	
	
	
	
	
	
	
	
	
}
