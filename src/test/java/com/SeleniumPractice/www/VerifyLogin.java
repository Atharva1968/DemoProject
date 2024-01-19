package com.SeleniumPractice.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyLogin {

	public static void main(String[] args) throws InterruptedException {
	
        WebDriver driver =new ChromeDriver();
		// to launch the browser 
        
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// to open the url 
		
		Thread.sleep(2000);
		// to pause
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("Admin");
		// to enter a data in username
		
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("admin123");
		// to enter a data in password
		
		WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
		
		login.click();
		// to click on login button
		
		String ExpectedTitle="Orange HRM";
		// to check the expected title of screen
		
		String ActualTitle=driver.getTitle();
		// to check what is actual title is 
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		System.out.println("Pass......user is able to access the application");
		// to check whether the application is usable or not to user 
	}

}
