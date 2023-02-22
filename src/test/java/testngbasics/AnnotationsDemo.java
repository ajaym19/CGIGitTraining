package testngbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserconfig() {
		System.out.println("I am in Before Method");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void validateLogin() {
		System.out.println("I am in Test Case 1");
		driver.findElement(By.id("email")).sendKeys("testuser");
		driver.findElement(By.id("pass")).sendKeys("testpassword");
		driver.findElement(By.name("login")).click();	
	}
	
	@Test
	public void validateTitle() {
		System.out.println("I am in Test Case 2");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("I am in After Method");
		driver.close();
	}
	
	@AfterSuite
	public void sendReport() {
		System.out.println("Sending Report");
	}
	
	@BeforeSuite
	public void dbConnection() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
}
