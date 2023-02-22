package testngbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void validateTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String exptitle = "Facebook – India";
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		Assert.assertEquals(acttitle, exptitle);
		Assert.assertTrue(false);
		driver.close();	
	}
}
