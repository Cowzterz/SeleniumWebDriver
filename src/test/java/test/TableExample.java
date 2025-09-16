package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//th"));

		System.out.println("Total number of rows: "+rows.size());
		System.out.println("Total number of column: "+column.size());
		
//		System.out.println("First column name is: "+column.get(0).getText());
//		System.out.println("Second column name is: "+column.get(1).getText());
//		System.out.println("Third column name is: "+column.get(2).getText());
		
		for (int i = 0; i < column.size(); i++) {
			System.out.println("Column name is: "+column.get(i).getText());
		}
		
		for (WebElement col : column) {
			System.out.println(col.getText());
		}
		
		String company = "Island Trading";
		WebElement countryName = driver.findElement(By.xpath("//td[text()='"+company+"']/following-sibling::td[2]"));
		System.out.println("Country Name: "+countryName.getText());
	}
}
