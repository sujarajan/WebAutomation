package com.web.automation.stepdefenition;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.base.Base;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
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
		
		List <WebElement> pages=driver.findElements(By.xpath("//a[@class='s-pagination-item s-pagination-button']"));
		for(int i=1;i<=pages.size();i++)
		{
			int j=i+1;
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()="+j +"]")).click();
			Thread.sleep(3000);
			List <WebElement> l1=driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));
			 

			System.out.println(l1.size());
			System.out.println(pages.size());
			 
			 for(WebElement s: l1) {
					
					String i1= s.getText().replace("," , "");
					
					int j1=Integer.parseInt(i1);
					
					if(j1<20000||j1>30000) {
						System.out.println(j1+" : Price value not Matching Filter loop"+i);
					}
					else if(j1>=20000||j1<=30000)
						System.out.println(j1+" : Price value matching the Filter loop"+i);

				}
			 
			
		}
		
		
		
		
		
	}

}

//C:\\Users\\Suja.Soundararajan\\eclipse-workspace\\Driver