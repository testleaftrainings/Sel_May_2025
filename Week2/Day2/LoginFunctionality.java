package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunctionality {

	public static void main(String[] args) {
		//Launch the Browser
		EdgeDriver driver=new EdgeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Enter the username
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
         
         //Enter the password
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         
         //Click on the Login button -click()
         driver.findElement(By.className("decorativeSubmit")).click();
	}

}
