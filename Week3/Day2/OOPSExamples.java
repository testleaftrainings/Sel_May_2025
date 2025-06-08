package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class OOPSExamples {

	public static void main(String[] args) {
		//Inheritance
		//Java
		//       Sub            Super
		//class Integer extends Number
		
		//Selenium Example
		//ChromeDriver extends ChromiumDriver extends RemoteWebDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Polymorphism
		//Method Overloading
		//Java
		//subString
		
		//Selenium
		//driver.switchTo().frame()
		
		//Method Overriding
		//Java
		String str="TestLeaf";
		//str.equals(str)
		//.equals method in String
		
		//Selenium
		driver.quit();
		//quit method in ChromiumDriver
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
