package testngbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test
	public void login() {
		System.out.println("Validating Login");	
	}

	@Test(dependsOnMethods = "login")
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");
		Assert.fail();
	}

	@Test(dependsOnMethods = { "login", "sendFriendRequest" })
	public void acceptFriendRequest() {
		System.out.println("Accepting Friend Request");
	}
}
