package testngbasics;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = -1)
	public void zebra() {
		System.out.println("zebra");
	}
	
	@Test(priority = 3)
	public void chickoo() {
		System.out.println("chickoo");
	}
	
	@Test(priority = 2, invocationCount = 3)
	public void apple() {
		System.out.println("apple");
	}
	
	@Test(enabled = false)
	public void grapes() {
		System.out.println("Grapes");
	}
}
