package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(5000);
		alt1.accept();
		
		
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alt2.dismiss();
		
	}
}
