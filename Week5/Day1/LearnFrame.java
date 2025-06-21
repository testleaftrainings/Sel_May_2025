package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/frame.xhtml");

		// Maximize
		driver.manage().window().maximize();

		// Transfer the driver focus to the frame
		driver.switchTo().frame(0);

		// click on the button
		driver.findElement(By.id("Click")).click();

	}

}
