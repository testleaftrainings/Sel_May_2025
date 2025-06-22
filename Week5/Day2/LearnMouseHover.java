package week5.day2;

import java.awt.event.WindowAdapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		//Create an Object for Actions
		Actions act=new Actions(driver);
		
		//Finding the element
		WebElement mouseHoverElement = driver.findElement(By.xpath("//span[text()='More']"));
		
		//Use the method to mousehover-moveToElement
		act.moveToElement(mouseHoverElement).perform();
	}

}
