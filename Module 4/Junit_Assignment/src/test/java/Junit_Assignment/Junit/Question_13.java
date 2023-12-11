package Junit_Assignment.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

public class Question_13 {
	static WebDriver driver;
	@Before
	public void before() {
	String url  = "https://accounts.google.com/"; 
	WebDriver driver =  DriverConnection.getDriver();
	driver.get(url);
	}
	@Test
	public void gmailLogin() throws InterruptedException {
		WebElement email = driver.findElement(By.name("identifier"));
		email.sendKeys("hello123@gmail.com");
		Thread.sleep(2000);
	
		WebElement nextButton = driver.findElement(By.id("identifierNext"));
		nextButton.click();
		
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("hello123");
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.id("passwordNext"));
		next.click();
		
		Thread.sleep(5000);
		
	}
	
	@After
	public  void after() {
		driver.close();
	}

}
