package week8.day1;

import org.testng.annotations.Test;

public class LearnPriority {

	// lowest to highest
	// Positive 1 2 3
	// negative -1 -2 -3

	@Test(priority = 3, enabled = false)
	public void enterCredentials() {
		System.out.println("enter credentials");

	}

	@Test(priority = 1)
	public void launchBrowser() {
		System.out.println("launch browser");

	}

	@Test(priority = 2)
	public void loadURL() {
		System.out.println("load url");

	}

}
