package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/frame.xhtml");

		// Maximize
		driver.manage().window().maximize();

		// Switch to the outer frame By WebElement
		WebElement frameElement = driver
				.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		driver.switchTo().frame(frameElement);

		// Switch to the inner frame
		driver.switchTo().frame("frame2");

		// Click on the element
		driver.findElement(By.id("Click")).click();

		// Switch to the main webpage - defaultContent
		driver.switchTo().defaultContent();

		// Switch to the immediate parent - defaultContent
		driver.switchTo().parentFrame();

	}

}
