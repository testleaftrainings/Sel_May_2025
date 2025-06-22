package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction {
	
	public static void main(String[] args) {
         ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act=new Actions(driver);
		
		WebElement scrollEle = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		act.scrollToElement(scrollEle).perform();
		
		
		scrollEle.click();
		
	}

}
