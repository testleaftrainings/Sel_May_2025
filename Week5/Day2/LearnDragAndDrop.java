package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		//find source
		WebElement sourceEle = driver.findElement(By.id("draggable"));
		
		//target
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(sourceEle, targetEle).perform();
		
		
		
		
		
		
		

	}

}
