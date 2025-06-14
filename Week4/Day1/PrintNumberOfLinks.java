package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNumberOfLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
        // To count the number of links
		int numberOfLinks = allLinks.size();
		System.out.println(numberOfLinks);

		// Declare a List of String type
		List<String> allText = new ArrayList<String>();

		// for loop to print the values
		for (int i = 0; i < numberOfLinks; i++) {
			String text = allLinks.get(i).getText();
			System.out.println(text);
		}

		// for each loop to print the values
		for (WebElement eachLinks : allLinks) {
			String text = eachLinks.getText();
			allText.add(text);
		}
		System.out.println(allText);
	}
}
