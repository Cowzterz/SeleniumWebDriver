package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		String fName, lName, mail, pass = null;
		
		Select ddDate;
		fName = "jameryan";
		lName = "fuerte";
		pass = "randomPass";
		mail = "random@gmail.com";

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement signUp = driver.findElement(By.partialLinkText("Create new account"));
		signUp.click();
		
		WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname]"));
		WebElement lastName = driver.findElement(By.cssSelector("input[name=lastname]"));
		WebElement bDateMonth = driver.findElement(By.cssSelector("select#month"));
		WebElement bDateDay = driver.findElement(By.cssSelector("select#day"));
		WebElement bDateYear = driver.findElement(By.cssSelector("select#year"));
		WebElement gender = driver.findElement(By.cssSelector("input[value='2']"));
		WebElement email = driver.findElement(By.cssSelector("input[name=reg_email__]"));
		WebElement passWord = driver.findElement(By.cssSelector("input[name=reg_passwd__]"));
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		
		ddDate = new Select(bDateMonth);
		ddDate.selectByVisibleText("Sep");
		
		ddDate = new Select(bDateDay);
		ddDate.selectByVisibleText("16");
		
		ddDate = new Select(bDateYear);
		ddDate.selectByVisibleText("1995");
		
		gender.click();
		
		email.sendKeys(mail);
		
		passWord.sendKeys(pass);
	}

}
