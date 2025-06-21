package week5.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://leafground.com/table.xhtml");

				// Maximize
				driver.manage().window().maximize();
				
				//Locating the table
				WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

				//Count the number of rows
				List<WebElement> rowValues = table.findElements(By.tagName("tr"));
				
				int rowCount = rowValues.size();
				System.out.println("The row count is: "+rowCount);
				
				//Count the number of columns
				List<WebElement> columnValues = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
				
				
				int columnCount = columnValues.size();
				System.out.println("The column count is: "+columnCount);
				
				//To retrieve the data
				WebElement row1col1Element = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]"));
				String text = row1col1Element.getText();
				System.out.println("Row1Col1 data is: "+text);
				
				//To get the entire row 1 data
				List<WebElement> row1Data = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
				
				for (int i = 0; i < row1Data.size(); i++) {
					String row1DataVales = row1Data.get(i).getText();
					System.out.println(row1DataVales);
				}
				
				//Retrieve entire data
				List<WebElement> allData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
				
				for (int i = 0; i < allData.size(); i++) {
					String allDataText = allData.get(i).getText();
					System.out.println("The data are: "+allDataText);
				}
	}

}
