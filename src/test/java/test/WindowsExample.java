package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsExample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		List<String> windows = new ArrayList<>(driver.getWindowHandles());
		String parent = windows.get(0);
		String child = windows.get(1);
		
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.close();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		List<String> newWindow = new ArrayList<>(driver.getWindowHandles());
		String windowParent = newWindow.get(0);
		String windowChild = newWindow.get(1);
		
		driver.switchTo().window(windowChild);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.close();
		driver.switchTo().window(windowParent);
		
	}
}
