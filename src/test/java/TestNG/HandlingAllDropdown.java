package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingAllDropdown {

			@Test
			public void VerifyAlldropdown() throws InterruptedException 
			{
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			WebElement download=driver.findElement(By.id("dropdown-class-example"));
			
			Select s = new Select(download);
			
			s.selectByVisibleText("Option2");
			Thread.sleep(3000);
			
			s.selectByIndex(3);
			Thread.sleep(2000);
			
			List<WebElement> dropdownoption=s.getOptions();
			
			
			for(WebElement a:dropdownoption)
			{
				System.out.println(a.getText());
			}

			System.out.println("All dropdown option: "+dropdownoption.size());
			
			driver.quit();
	}

}
