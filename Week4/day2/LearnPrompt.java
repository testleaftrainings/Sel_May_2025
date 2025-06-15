package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPrompt {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.leafground.com/alert.xhtml");

		// Maximize
		driver.manage().window().maximize();
		
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		Alert promptAlert = driver.switchTo().alert();

		// getText
		String text = promptAlert.getText();
		System.out.println("The alert text is: " + text);

		// sendKeys
		promptAlert.sendKeys("Selenium");

		// accept
		promptAlert.accept();

	}

}
