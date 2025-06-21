package week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");

				// Maximize
				driver.manage().window().maximize();
				
				//finding the element
				WebElement textField = driver.findElement(By.id("username"));
				
				//Take the Screenshot
				File source = textField.getScreenshotAs(OutputType.FILE);
				
				//Set the destination for storing
				File destination=new File("./Snaps/imageTextField.png");
				
				//Storing the screenshot in the destination
				FileUtils.copyFile(source, destination);

	}

}
