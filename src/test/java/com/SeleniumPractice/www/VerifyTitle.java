package com.SeleniumPractice.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		String expected_title="Orange HRM";
		
		String actual_title=driver.getTitle();
		
		Assert.assertEquals(expected_title,actual_title);
		
		System.out.println("the title is verified and correct...");
		
		System.out.println("pass....");
	}

}
