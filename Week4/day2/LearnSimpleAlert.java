package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		        // Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://www.leafground.com/alert.xhtml");

				// Maximize
				driver.manage().window().maximize();
				
				//Click the simple
				driver.findElement(By.xpath("//span[text()='Show']")).click();
				
				//Click the prompt alert without handling simple alert
				//driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
				//Transfer the driver focus to the alert box
				Alert simpleAlert = driver.switchTo().alert();
				
				//getText
				String text = simpleAlert.getText();
				System.out.println(text);
				
				//accept the alert
				simpleAlert.accept();
				
				
				
				
				
				
				
				

	}

}
