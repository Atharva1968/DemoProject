package com.SeleniumPractice.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckButt {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> a= driver.findElements(By.cssSelector("input[type='checkbox']"));

		        //for loop
				for (int i=0;i<a.size();i++)
				{
					a.get(i).click();
					Thread.sleep(2000);		
				}
				driver.quit();
				
				
				//for each loop
//				for(WebElement k:a)
//				{
//					k.click();
//				}
//				driver.quit()		
			
	}

}
