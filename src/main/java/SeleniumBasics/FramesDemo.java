package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		//open this https://the-internet.herokuapp.com/tinymce
		//clear the existing content and write your name in the text box
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		
		//identify the frame and switch to the frame
		List<WebElement> framescount = driver.findElements(By.tagName("iframe"));
		System.out.println(framescount.size());
		
		//driver.switchTo().frame(0);
		//*[@id="mce_0_ifr"]
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Ajay Trainer");
		driver.switchTo().parentFrame();
	}
}
