package Junit_Assignment.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.DriverConnection;

public class Question_12 {
	
	static WebDriver driver;
	@BeforeClass
		public static void beforeClass() {
			
		String url  = "https://www.facebook.com/"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		}
	
	
	@Test
	
	public void testFBlogin() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("heyTest@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
	}
		
	
	@AfterClass
		public static void afterClass() {
			driver.close();
		}
	}

