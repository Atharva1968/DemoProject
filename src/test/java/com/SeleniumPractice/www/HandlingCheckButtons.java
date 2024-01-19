package com.SeleniumPractice.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckButtons {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement checkbox1= driver.findElement(By.cssSelector("input[value='option1']"));
		
		WebElement checkbox2= driver.findElement(By.cssSelector("input[value='option2']"));
		
		WebElement checkbox3= driver.findElement(By.cssSelector("input[value='option3']"));
		
		
		checkbox1.click();
		Thread.sleep(2000);
		
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
		
		
		checkbox2.click();
		Thread.sleep(2000);
		
		System.out.println(checkbox2.isSelected());
		System.out.println(checkbox2.isDisplayed());
		System.out.println(checkbox2.isEnabled());
		
		
		checkbox3.click();
		
		System.out.println(checkbox3.isSelected());
		System.out.println(checkbox3.isDisplayed());
		System.out.println(checkbox3.isEnabled());

	}

}
