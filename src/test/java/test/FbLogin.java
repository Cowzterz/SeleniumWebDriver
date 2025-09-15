package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		String name, pass = null;
		
		name = "jameryan";
		pass = "randomPass";

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		WebElement forgotPwd = driver.findElement(By.linkText("Forgot password?"));
//		forgotPwd.click();
		
//		WebElement forgotPwd = driver.findElement(By.partialLinkText("Forgot"));
//		forgotPwd.click();
		
		WebElement facebookText = driver.findElement(By.tagName("h2"));
		System.out.println(facebookText.getText());
		
//		WebElement userName = driver.findElement(By.id("email"));
//		WebElement passWord = driver.findElement(By.name("pass"));
//		WebElement loginBtn = driver.findElement(By.name("login"));
//		
//		userName.sendKeys(name);
//		passWord.sendKeys(pass);
//		loginBtn.click();

//		driver.close();
	}

}
