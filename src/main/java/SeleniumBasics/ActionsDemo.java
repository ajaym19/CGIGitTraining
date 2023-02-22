package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	//used to perform keyboard and mouse interactions 
	
	public static void main(String[] args) {
		//keyboardEvents();
		//mouseHover();
		//clicks();
		//dragAndDrop();
		scroller();
	}
	
	public static void keyboardEvents() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.click(username).keyDown(Keys.SHIFT).sendKeys("testuser").keyUp(Keys.SHIFT).perform();
	}
	
	public static void mouseHover() {
		//a[text()='Kids'][1]
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com/");
		WebElement kidsmenu = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(kidsmenu).perform();
	}
	
	public static void clicks() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.contextClick(username).perform();
	}
	
	public static void dragAndDrop() {
		//open https://jqueryui.com/droppable/
		//identify source element
		//identify target elements
		//Actions >> draganddrop >> pass source and target
		//*[@id="content"]/iframe
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	
	public static void scroller() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		/*
		 * First parameter:
		 * 	Horizontal Axis
			 * 	used to scroll left and right
			 * 	positive: scroll right
			 * 	negative: scroll left
		 * Vertical Axis
			 * 	used to scroll up and down
			 * 	positive: scroll down
			 * 	negative: scroll up
		 * 
		 */
		//scrolling by some pixels
		//act.scrollByAmount(0, 600).perform();
		
		//scrolling to a specific element
		WebElement target = driver.findElement(By.xpath("//h2[text()='Discover your home']"));
		act.scrollToElement(target).perform();
	}
	
	
}
