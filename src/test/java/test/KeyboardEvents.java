package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardEvents {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("today is tuesday");
		search.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
		search.sendKeys("what is the day today?");		
	}
}
