package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

	public static void main(String[] args) {
		       //Launch the Browser
				EdgeDriver driver=new EdgeDriver();
				
				//Load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Enter the username
				//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		         
		         //Enter the password
		         driver.findElement(By.id("password")).sendKeys("crmsfa");
		         
		         //Click on the Login button -click()
		         driver.findElement(By.className("decorativeSubmit")).click();
		         
		         //Click the crmsfa link
		         driver.findElement(By.linkText("CRM/SFA")).click();
		         
		         //Click on the Leads
		         driver.findElement(By.linkText("Leads")).click();
		         
		         //Click on the CreateLead link
		         driver.findElement(By.linkText("Create Lead")).click();
		         
		         //Enter the companyname
		         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		         
		         //Enter the firstname
		         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		         
		         //Enter the lastname
		         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		         
		         //Step1: Find the Element
		          WebElement sourceDrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		         
		         //Step2: Create an Object Select
		         Select dropdown=new Select(sourceDrop);
		        
		         //Step3: Use the method to select the options
		         //dropdown.selectByIndex(3);
		         
		         //Select by value
		         //dropdown.selectByValue("LEAD_EMPLOYEE");
		         
		         //Select by text
		         dropdown.selectByVisibleText("Existing Customer");
		         
		         //Click on CreateLead button
		         driver.findElement(By.name("submitButton")).click();
		         
		        }

}
