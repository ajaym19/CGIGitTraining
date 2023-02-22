package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException  {
		
		//Open this application 
		//https://testpages.herokuapp.com/styled/alerts/alert-test.html
		//click on Show Alert Box button
		//Click on OK button on the alert box
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(4000);
		//now the alert is present
		//handle the alert
		driver.switchTo().alert().accept();
		
		//driver.findElement(By.id("confirmexample")).click();
		
	}
}
