package com.web.automation.stepdefenition;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suja.Soundararajan\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']//a[text()=\" Electronics \"]")).sendKeys(selectLinkOpeninNewTab);
		
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']//a[text()=\"Fashion\"]")).sendKeys(selectLinkOpeninNewTab);
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']//a[text()=\"Mobiles\"]")).sendKeys(selectLinkOpeninNewTab);
		
		
		String main=driver.getWindowHandle();
		
		Set <String> childs=driver.getWindowHandles();
	    Iterator itr=childs.iterator();
	    int i=1;
	    while(itr.hasNext() && i<10)
	    {
	    	
	    	String s=itr.next().toString();
	    	if(!main.equals(s))
	    	{
	    	driver.switchTo().window(s);
	    	String s3=driver.getTitle();
	    	if(s3.contains("Electronics"))
	    		{
	    		System.out.println(s3);
	    		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']")).sendKeys("Television",Keys.ENTER);
	    		break;
	    		}
	    	i++;
	    	}
		
			
		}
		

	}

}
