package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebdriverMethods {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		String titleOfPage = driver.getTitle();
		System.out.println("The title is: "+titleOfPage);
		
		//To get currentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The url is: "+currentUrl);
		
		//Enter the username
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        
        //Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        //Click on the Login button -click()
        driver.findElement(By.className("decorativeSubmit")).click();
		
        String textOnElement = driver.findElement(By.linkText("CRM/SFA")).getText();

        System.out.println(textOnElement);
	}

}
