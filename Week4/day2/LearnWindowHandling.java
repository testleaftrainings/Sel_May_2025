package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/window.xhtml");

		// Maximize
		driver.manage().window().maximize();

		// Click on the Open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		// getWindowHandle
		String parentAddress = driver.getWindowHandle();
		System.out.println("The parenta address is: " + parentAddress);
		
        // getWindowHandles
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println("Address are: " + allAddress);
	

		// Declare an empty List
		List<String> addressList = new ArrayList<String>(allAddress);

		// getTitle
		String titleBeforeSwitching = driver.getTitle();
		System.out.println(titleBeforeSwitching);

		// Transfer the driver
		driver.switchTo().window(addressList.get(1));

		String titleAfterSwitching = driver.getTitle();
		System.out.println(titleAfterSwitching);

		// Close the current window
		driver.close();

		// Close all the opened window
		// driver.quit();

		driver.switchTo().window(addressList.get(0));

		String title = driver.getTitle();
		System.out.println("The current title is: " + title);

	}

}
