package Junit_Assignment.Junit;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

@RunWith(Parameterized.class)
public class Question_14 {
		
	String email;
	String password;
	
	public Question_14(String email,String password) {
		this.email=email;
		this.password=password;
		
	}
	
	static WebDriver driver;
	
	@BeforeClass
	// for opening every combination in single chrome driver
	public static void brforeClass() {
		driver = new DriverConnection().getDriver();
		driver.get("https://www.facebook.com/");
	}
//	@AfterClass
//	public static void afterClass() {
//		driver.close();
//	}
	
	@Test
	public void FBlogin() throws InterruptedException {
		
		
// For opening in new chrome driver with each new combination
		
//		WebDriver driver = new DriverConnnection().getDriver();
//		driver.get("https://www.facebook.com/");
		
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		Thread.sleep(1000);
		
		WebElement passwordEle = driver.findElement(By.id("pass"));
		passwordEle.clear();
		passwordEle.sendKeys(password);
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}
	
	@Parameters
	public static List<Object[]> getData() {
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "heyincorrect@gmail.com";
		obj[0][1] = "heyincorrect@123";
		
		obj[1][0] = "hello123incorrect@gmail.com";
		obj[1][1] = "hello12correct@456";
		
		obj[2][0] = "holaa123correct@gmail.com";
		obj[2][1] = "holaa23incorrect@123";
		
		obj[3][0] = "8155887857";
		obj[3][1] = "correctPassword";
		
		return Arrays.asList(obj);
		
		
	}
}

