package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement signUp = driver.findElement(By.partialLinkText("Create new account"));
		signUp.click();
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		for (WebElement month : months) {
			System.out.println(month.getText());
		}
		WebElement year = driver.findElement(By.xpath("(//option[@selected='1'])[3]"));
		System.out.println(year.getText());
	}
}
