package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/waits.xhtml");

		// Maximize
		driver.manage().window().maximize();
		
		//add implicit
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click the button
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//Visibilty
		//Thread.sleep(10000);
		//boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		//System.out.println(displayed);
		
		//Declaration of WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
		
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		boolean displayed2 = until.isDisplayed();
		System.out.println(displayed2);

	}

}

//500 ms - pooling time of WebDriverWait    - 20 times

//Diff Bw WebDriverWait 
