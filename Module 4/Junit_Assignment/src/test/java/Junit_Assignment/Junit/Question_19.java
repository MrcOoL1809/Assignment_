package Junit_Assignment.Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import Util.DriverConnection;

public class Question_19 {
	static WebDriver driver;
	@BeforeTest
	public static void openBrowser() throws InterruptedException {
		String url = "https://www.instagram.com"; 
		WebDriver driver =  DriverConnection.getDriver();
		driver.get(url);
		Thread.sleep(3000);
	}
	
	@Test(dataProvider = "inputValues")
	public void InstaLogin(String email,String password) throws InterruptedException {
		
		WebElement emailEle = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		emailEle.clear();
		emailEle.sendKeys(email);
		Thread.sleep(2000);
	
		WebElement passEle = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		passEle.clear();
		passEle.sendKeys(password);
		Thread.sleep(2000);
		
//		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
//		login.click();
	}
	
	@DataProvider(name = "inputValues")
	public static Object[][] data(){
		Object obj[][] = new Object [4][2];
		obj[0][0] = "wrongEmail@gmail.com";
		obj[0][1] = "wrongPass123";
		
		obj[1][0] = "wrongEmail@gmail.com";
		obj[1][1] = "RightPass123";
		
		obj[2][0] = "RightEmail@gmail.com";
		obj[2][1] = "wrongPass123";
		
		obj[3][0] = "RightEmail@gmail.com";
		obj[3][1] = "RightPass123";
		return obj;
	}
	
	@AfterTest
	public void closeBrowser() {
				
		driver.close();
	}
}

