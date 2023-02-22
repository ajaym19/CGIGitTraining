package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		// Parent Window: Selenium Framework | Practiceform
		// Child Window: Selenium Framework | Selenium, Cucumber, Ruby, Java et al.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println(driver.getTitle());

		driver.findElement(By.id("button1")).click();
		// at this point there are 2 windows
		Set<String> windows = driver.getWindowHandles();
// 		for (String abc : windows) {
//			System.out.println(abc);
//		}

		Iterator<String> it = windows.iterator();
		String pWindowId = it.next();
		String cWindowId = it.next();
		System.out.println(pWindowId);
		System.out.println(cWindowId);

		// to get the title of the child window?, we need to switch to the child window
		driver.switchTo().window(cWindowId);
		System.out.println(driver.getTitle());
		// driver.close(); will only close the window pointed by the browser
		driver.quit();
		// print the parent window title?
		// max, min, close, quit

		// Assertions, Actions, Selenium 4
		//revise the topics  covered yesterday, we will startr in few mins
	}
}
