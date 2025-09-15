package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLogin {

	public static void main(String[] args) {
		String uname = "standard_user";
		String pwd = "secret_sauce";
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		WebElement cred = driver.findElement(By.className("login_credentials"));
		System.out.println(cred.getText());
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passWord = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		userName.sendKeys(uname);
		passWord.sendKeys(pwd);
		loginBtn.click();
	}

}
