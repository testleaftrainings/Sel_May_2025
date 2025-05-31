package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Launch the browser - Chrome Browser
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		  
		//Load the URL - get
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Closing the browser
		driver.close();
		
	}
	}
