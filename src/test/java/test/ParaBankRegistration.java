package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement register = driver.findElement(By.xpath("//a[starts-with(text(), 'Register')]"));
		register.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
		firstName.sendKeys("test");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='customer.lastName']"));
		lastName.sendKeys("machine");
		
		WebElement address = driver.findElement(By.xpath("//input[@name='customer.address.street']"));
		address.sendKeys("1 juan tubo");
		
		WebElement city = driver.findElement(By.xpath("//*[@id='customer.address.city']"));
		city.sendKeys("new");
		
		WebElement state = driver.findElement(By.xpath("//*[@id='customer.address.state']"));
		state.sendKeys("york");
		
		WebElement zipCode = driver.findElement(By.xpath("//*[@id='customer.address.zipCode']"));
		zipCode.sendKeys("1000");
		
		WebElement phoneNum = driver.findElement(By.xpath("//*[@id='customer.phoneNumber']"));
		phoneNum.sendKeys("61922222");
		
		WebElement ssn = driver.findElement(By.xpath("//*[@id='customer.ssn']"));
		ssn.sendKeys("test");
		
		WebElement userName = driver.findElement(By.xpath("//*[@id='customer.username']"));
		userName.sendKeys("testmachine1");
		
		WebElement passWord = driver.findElement(By.xpath("//*[@id='customer.password']"));
		passWord.sendKeys("test12345");
		
		WebElement confirmPass = driver.findElement(By.xpath("//*[@id='repeatedPassword']"));
		confirmPass.sendKeys("test12345");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		submit.click();
	}

}
