package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingApplication {

	// CTRL+SPACE
	
 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testuser@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("testpassword");
		
	//	driver.findElement(By.name("login")).click();

		/*
		 * Locators:
		 * webelement
		 * id, name, css, xpath
		 * 
		 * //*[@id="email"]
		 * #email
		 * 
		 * Links
		 * linktext
		 * partiallinktext
		 * 
		 * forgotten ajay
		 * forgotten vinay
		 * 
		 * 
		 */
		
		//identifying and clicking on a link
		//WebElement forgotPasswordlink = driver.findElement(By.linkText("Forgotten password?"));
		WebElement forgotPasswordlink = driver.findElement(By.partialLinkText("Forgotten"));
		forgotPasswordlink.click();
		
		
		
	}
}
