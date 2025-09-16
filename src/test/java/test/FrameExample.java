package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameExample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebElement frameHeader;
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.switchTo().frame("frame1");
		frameHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameHeader.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		frameHeader = driver.findElement(By.tagName("h1"));
		System.out.println(frameHeader.getText());
	}
}
