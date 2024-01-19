package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {

	@Test
	public void VerifyDropdown() throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	Thread.sleep(2000);
	
	WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
	
	Select s = new Select(dropdown);
	
	s.selectByIndex(1);
	
	Thread.sleep(2000);
	
//	s.selectByValue("");
//	
//	Thread.sleep(2000);
	
	s.selectByVisibleText("Option 3");
	}
	
}

