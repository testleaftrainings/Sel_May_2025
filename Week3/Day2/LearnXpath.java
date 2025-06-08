package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// Launch the Browser
		EdgeDriver driver = new EdgeDriver();

		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");

		// Click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
