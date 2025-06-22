package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions act = new Actions(driver);

		WebElement rightClcikEle = driver.findElement(By.xpath("//span[text()='right click me']"));

		act.contextClick(rightClcikEle).perform();

	}

}
